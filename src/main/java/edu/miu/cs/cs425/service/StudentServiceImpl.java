package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.Student;
import edu.miu.cs.cs425.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer studentId) {
            studentRepository.deleteById(studentId);
    }

    @Override
    public Student update(Integer studentId, Student newStudent) {
        Student student = findById(studentId);

        if (student != null) {

            if (newStudent != null) {

                if (newStudent.getName() != null) {
                    student.setName(newStudent.getName());
                }

                if (newStudent.getGpa() != null) {
                    student.setGpa(newStudent.getGpa());
                }

                if (newStudent.getAddress() != null) {
                    student.setAddress(newStudent.getAddress());
                }

                if (newStudent.getCourses() != null) {
                    student.setCourses(newStudent.getCourses());
                }
            }
            return studentRepository.save(student);
        }

        return null;
    }

    @Override
    public Student findById(Integer studentId) {
        return null;
    }
}
