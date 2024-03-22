package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Grade {
    @Id
    @SequenceGenerator(name = "grade_gen", sequenceName = "grade_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grade_gen")
    private Long id;
    private int value;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;
}