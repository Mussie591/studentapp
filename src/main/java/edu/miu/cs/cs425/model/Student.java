package edu.miu.cs.cs425.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public Address address;
}
