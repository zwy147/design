package com.example.design.entity;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cname;
    private float grade;
    private float weight;
    @OneToMany(mappedBy = "course")
    private List<Select> selects;
}
