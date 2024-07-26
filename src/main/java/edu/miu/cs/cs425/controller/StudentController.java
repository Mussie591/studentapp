package edu.miu.cs.cs425.controller;

import edu.miu.cs.cs425.model.Student;
import edu.miu.cs.cs425.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students/by-gpa")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudentsByGpa(@RequestParam(name = "gpa") double gpa) {
        return studentService.getStudentsByGpa(gpa);
    }
}
