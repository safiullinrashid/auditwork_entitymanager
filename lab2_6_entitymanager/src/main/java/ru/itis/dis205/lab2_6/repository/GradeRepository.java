package ru.itis.dis205.lab2_6.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.dis205.lab2_6.model.Grade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class GradeRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Grade save(Grade grade) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(grade);
        entityManager.getTransaction().commit();
        entityManager.close();
        return grade;
    }
}
