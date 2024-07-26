package edu.miu.cs.cs425.repository;

import java.util.List;

public class StudentRepository {

    List<Student> findAllStudentsByProgramAndGpaLessThan(String program, double gpa);
}
