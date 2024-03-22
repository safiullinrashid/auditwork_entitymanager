package ru.itis.dis205.lab2_6.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.dis205.lab2_6.model.Person;
import ru.itis.dis205.lab2_6.model.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class TeacherRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Person save(Person teacher) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (teacher.getId() != null) {
            entityManager.merge(teacher);
        } else {
            entityManager.persist(teacher);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return teacher;
    }
}
