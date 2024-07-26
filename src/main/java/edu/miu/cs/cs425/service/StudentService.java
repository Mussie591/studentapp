package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudentsByGpa(double gpa);

}
