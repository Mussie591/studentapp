package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudentsByGpa(double gpa);

    public Student addStudent(Student student);
    public List<Student> findAll();
    public void delete(Integer studentId);
    public Student update(Integer studentId, Student newStudent);
    public Student findById(Integer studentId);
}
