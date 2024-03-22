package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Teacher extends Person{
    @Id
    @SequenceGenerator(name = "teaacher_gen", sequenceName = "teaacher_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teaacher_gen")
    private String subject;

    private int experience;
}