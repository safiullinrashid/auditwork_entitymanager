package ru.itis.dis205.lab2_6.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.dis205.lab2_6.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class GroupRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Group save(Group group) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(group);
        entityManager.getTransaction().commit();
        entityManager.close();
        return group;
    }
}
