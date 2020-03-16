package com.example.design.entity;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Select {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int selected;
    @ManyToOne
    private Student student;
   @ManyToOne
    private Course course;
}
