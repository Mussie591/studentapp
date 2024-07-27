package edu.miu.cs.cs425.controller;

import edu.miu.cs.cs425.model.Course;
import edu.miu.cs.cs425.model.Student;
import edu.miu.cs.cs425.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/api/v1/student")
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") Integer studentId){
        return studentService.findById(studentId);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        studentService.delete(id);
    }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") Integer id, @RequestBody Student student){
        return studentService.update(id, student);
    }
  
  
 @GetMapping("/students/by-gpa")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudentsByGpa(@RequestParam(name = "gpa") double gpa) {
        return studentService.getStudentsByGpa(gpa);
    }

}
