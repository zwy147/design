package com.example.design.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sname;
   @OneToMany(mappedBy = "student")
    private List<Select> selects;
   @ManyToOne
    private Teacher teacher;
}
