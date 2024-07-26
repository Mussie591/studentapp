package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseDetailsRepository extends JpaRepository<CourseDetails, Integer> {
//    @Query("SELECT s FROM Student s WHERE s.gpa <= :gpaValue")
//    List<Student> findStudentsByGpaLessThanEqual(@Param("gpaValue") double gpaValue);

}
