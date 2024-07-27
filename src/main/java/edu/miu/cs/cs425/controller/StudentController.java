package edu.miu.cs.cs425.controller;

import edu.miu.cs.cs425.model.Student;
import edu.miu.cs.cs425.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student findById(@PathVariable("id") Integer studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Integer id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @GetMapping("/by-gpa")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudentsByGpa(@RequestParam(name = "gpa") double gpa) {
        return studentService.getStudentsByGpa(gpa);
    }
}
