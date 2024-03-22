package ru.itis.dis205.lab2_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.dis205.lab2_6.model.Grade;
import ru.itis.dis205.lab2_6.model.Student;
import ru.itis.dis205.lab2_6.repository.GradeRepository;
import ru.itis.dis205.lab2_6.repository.StudentRepository;

@Component
public class MainClass implements Runnable {

    private final StudentRepository studentRepository;
    private final GradeRepository gradeRepository;

    @Autowired
    public MainClass(StudentRepository studentRepository, GradeRepository gradeRepository) {
        this.studentRepository = studentRepository;
        this.gradeRepository = gradeRepository;
    }

    @Override
    public void run() {
        Student student = new Student();
        student.setFirstName("Александр");
        student.setLastName("Иванов");

        studentRepository.save(student);

        Grade grade = new Grade();
        grade.setValue(56);
        gradeRepository.save(grade);
        System.out.println(grade.getId());
        gradeRepository.save(grade);
    }
}