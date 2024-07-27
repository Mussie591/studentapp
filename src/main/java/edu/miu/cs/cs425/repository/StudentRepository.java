package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Course;
import edu.miu.cs.cs425.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> 6a9cd9423ba3cf512cd833565f5d80571056f6cf
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT s.courses FROM Student s WHERE s.Id = :studentId")
    List<Course> findCoursesByStudentId(@Param("studentId") int studentId);

    @Query("SELECT s FROM Student s WHERE s.gpa <= :gpa")
    List<Student> findStudentsByGpaLessThanEqual(@Param("gpaValue") double gpa);
}
