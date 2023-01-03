package com.jdbcexample.sakilajdbc.actor.dao;

import com.jdbcexample.sakilajdbc.actor.domain.Actor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDao {

    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "tolga123";
    private String listSql = "SELECT * FROM actor";
    private String nameSql = "SELECT * FROM actor Where first_name = ?";


    public ActorDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Actor> findAllActor() {

        List<Actor> actorList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(listSql);
             ResultSet rs = statement.executeQuery(listSql)
        ) {
            while (rs.next()) {
                int id = rs.getInt("actor_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date lastUpdate = rs.getDate("last_update");

                Actor actor = new Actor();
                actor.setActorId(id);
                actor.setFirstName(firstName);
                actor.setLastName(lastName);
                actor.setLastUpdate(lastUpdate);
                actorList.add(actor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return actorList;
    }

    public Actor findActorById(int id) {

        String sql = "Select * from actor where actor_id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int recordId = resultSet.getInt("actor_id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                Date last_update = resultSet.getDate("last_update");

                Actor actor = new Actor();
                actor.setActorId(recordId);
                actor.setFirstName(first_name);
                actor.setLastName(last_name);
                actor.setLastUpdate(last_update);
                return actor;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Actor> findAllActorByFirstName(String firstName) {

        List<Actor> actorList = new ArrayList<Actor>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from actor where first_name = ?");
        ) {

            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("actor_id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                Date last_update = resultSet.getDate("last_update");

                Actor actor = new Actor();
                actor.setActorId(id);
                actor.setFirstName(first_name);
                actor.setLastName(last_name);
                actor.setLastUpdate(last_update);
                actorList.add(actor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return actorList;
    }

    public int saveActor(Actor actor) {

        String sql;

        if (actor.getActorId() < 1) {
            sql =
                    "insert into actor " +
                            "       (first_name, last_name, last_update)" +
                            "values (?, ?, ?)";
        } else {
            sql =
                    "update actor " +
                            "set    first_name = ?, " +
                            "       last_name  = ?, " +
                            "       last_update = ? " +
                            "where  actor_id = ?";
        }

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            java.util.Date lastUpdate = actor.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(3, sqlDate);

            if (actor.getActorId() > 0) preparedStatement.setInt(4, actor.getActorId());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

