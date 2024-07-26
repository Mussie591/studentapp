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
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int Id;
    public String name;
    public Double gpa;


    @ManyToMany
    @JoinTable(name = "Student_Course",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
