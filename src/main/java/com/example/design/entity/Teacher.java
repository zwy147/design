package com.example.design.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tname;
    private int repectNumber;
    private int chooseNumber;
    @OneToMany(mappedBy = "teacher")
    private List<Student> students  ;


}
