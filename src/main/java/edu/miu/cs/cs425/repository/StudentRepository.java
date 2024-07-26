package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("SELECT s FROM Student s WHERE s.gpa <= :gpa")
    List<Student> findStudentsByGpaLessThanEqual(@Param("gpaValue") double gpa);
}
