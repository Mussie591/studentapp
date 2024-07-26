package edu.miu.cs.cs425.controller;

import edu.miu.cs.cs425.model.CourseDetails;
import edu.miu.cs.cs425.service.CourseDetailsImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coursedetails")
public class CourseDetailsController {
    private final CourseDetailsImpl courseDetailsService;

    public CourseDetailsController(CourseDetailsImpl courseDetailsService) {
        this.courseDetailsService = courseDetailsService;
    }
    @GetMapping
    public CourseDetails getCourseDetails(CourseDetails courseDetails) {
        return courseDetailsService.getCourseDetails(courseDetails);
    }
    @GetMapping("/all")
    public Iterable<CourseDetails> getAllCourseDetails() {
        return courseDetailsService.getAllCourseDetails();
    }

    @PostMapping
    public void saveCourseDetails(CourseDetails courseDetails) {
      courseDetailsService.saveCourseDetails(courseDetails);
    }
    @GetMapping("/course")
    public Iterable<CourseDetails> getCourseDetailsByCourse(CourseDetails courseDetails) {
        return courseDetailsService.getCourseDetailsByCourse(courseDetails);
    }
    @DeleteMapping("/{descriptionId}")
    public void deleteCourseDetails(@PathVariable Integer descriptionId) {
        courseDetailsService.deleteCourseDetails(descriptionId);
    }
    @PutMapping
    public void updateCourseDetails(CourseDetails courseDetails) {
         courseDetailsService.updateCourseDetails(courseDetails);
    }


}
