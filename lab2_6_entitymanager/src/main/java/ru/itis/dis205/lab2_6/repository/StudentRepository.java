package ru.itis.dis205.lab2_6.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.dis205.lab2_6.model.Person;
import ru.itis.dis205.lab2_6.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class StudentRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Person save(Person student) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (student.getId() != null) {
            entityManager.merge(student);
        } else {
            entityManager.persist(student);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }
}
