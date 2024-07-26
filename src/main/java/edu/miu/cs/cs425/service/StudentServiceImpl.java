package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.Student;
import edu.miu.cs.cs425.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudentsByGpa(double gpa) {
        return studentRepository.findStudentsByGpaLessThanEqual(gpa);

    }
}
