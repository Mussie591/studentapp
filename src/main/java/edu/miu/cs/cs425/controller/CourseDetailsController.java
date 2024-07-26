package edu.miu.cs.cs425.controller;

import edu.miu.cs.cs425.service.CourseDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coursedetails")
public class CourseDetailsController {
    private final CourseDetailsService courseDetailsService;

    public CourseDetailsController(CourseDetailsService courseDetailsService) {
        this.courseDetailsService = courseDetailsService;
    }

}
