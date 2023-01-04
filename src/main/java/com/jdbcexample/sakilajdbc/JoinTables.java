package com.jdbcexample.sakilajdbc;

import com.jdbcexample.sakilajdbc.actor.domain.Actor;

import java.sql.*;

public class JoinTables {
    String sql = "SELECT a.actor_id, a.first_name, a.last_name " +
            "FROM actor a " +
            "JOIN film_actor fa ON a.actor_id = fa.actor_id " +
            "WHERE a.actor_id = ?";

    String sql1 = "SELECT a.actor_id, a.first_name,a.last_name, count(f.actor_id) as total " +
            "FROM film_actor as f " +
            "join actor as a ON f.actor_id = a.actor_id " +
            "WHERE a.actor_id = ? ";
    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "tolga123";


    public JoinTables() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public Actor getPlayedFilmsByActorID(int actorId) throws SQLException {

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = connection.prepareStatement(sql1);

        ) {

            stmt.setInt(1, actorId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("actor_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int total = rs.getInt("total");


                Actor actor = new Actor();
                actor.setActorId(id);
                actor.setFirstName(firstName);
                actor.setLastName(lastName);
                actor.setTotal(total);
                return actor;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
