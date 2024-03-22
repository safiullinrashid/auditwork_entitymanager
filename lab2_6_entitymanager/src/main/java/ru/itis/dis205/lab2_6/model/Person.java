package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public abstract class Person {

    @Id
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_gen")
    protected Long id;

    protected String firstName;
    protected String lastName;
}