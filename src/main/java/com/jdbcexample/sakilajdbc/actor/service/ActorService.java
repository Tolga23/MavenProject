package com.jdbcexample.sakilajdbc.actor.service;

import com.jdbcexample.sakilajdbc.actor.dao.ActorDao;
import com.jdbcexample.sakilajdbc.actor.domain.Actor;

import java.util.List;

public class ActorService {
    private ActorDao actorDao = new ActorDao();

    public List<Actor> findAllActor() {
        return actorDao.findAllActor();
    }

    public Actor findActorById(int id) {
        return actorDao.findActorById(id);
    }

    public List<Actor> findAllActorByFirstName(String firstName) {
        return actorDao.findAllActorByFirstName(firstName);
    }

    public int saveActor(Actor actor) {

        if (actor.getLastName() == null || "".equals(actor.getLastName())) throw new RuntimeException("Soyadı olmadan kayıt yapılamaz.");
        return actorDao.saveActor(actor);
    }

}
