package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
public class Subject {
    @Id
    @SequenceGenerator(name = "subject_gen", sequenceName = "subject_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_gen")
    private Long id;

    private String name;

    private int hours;

    @ManyToMany(mappedBy = "subjects")
    private List<Group> groups;
}
