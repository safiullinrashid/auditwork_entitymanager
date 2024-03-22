package ru.itis.dis205.lab2_6.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.*;
@Getter
@Setter
@Entity
public class Group {
    @Id
    @SequenceGenerator(name = "group_gen", sequenceName = "group_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_gen")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Student> students;
}