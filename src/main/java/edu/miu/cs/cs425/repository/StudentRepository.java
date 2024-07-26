package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Course;
import edu.miu.cs.cs425.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT s.courses FROM Student s WHERE s.Id = :studentId")
    List<Course> findCoursesByStudentId(@Param("studentId") int studentId);

}
