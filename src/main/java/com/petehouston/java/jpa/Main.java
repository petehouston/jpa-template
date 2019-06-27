package com.petehouston.java.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        User user = new User("petehouston", "contact@petehouston.com");
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
