package ru.itis.dis205.lab2_6.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.dis205.lab2_6.model.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class SubjectRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Subject save(Subject subject) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(subject);
        entityManager.getTransaction().commit();
        entityManager.close();
        return subject;
    }
}
