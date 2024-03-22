package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Student extends Person{
    @Id
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")

    @ManyToOne
    private Group group;
}
