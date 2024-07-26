package edu.miu.cs.cs425.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name =" student_id")

    private int Id;
    private String name;
    private Double gpa;
    @ManyToOne()
    @JoinColumn(name = "address_id")
    private Address address;


    @ManyToMany
    @JoinTable(name = "Student_Course",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;


}
