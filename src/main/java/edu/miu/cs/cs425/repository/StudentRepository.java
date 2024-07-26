package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("select s from Student s join s.CourseDetails cc join cc.program p where p.name = :program and s.gpa < :gpa")
    List<Student> findAllStudentsByProgramAndGpaLessThan(String program, Double gpa);
}
