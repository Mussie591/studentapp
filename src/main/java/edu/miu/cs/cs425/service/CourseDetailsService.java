package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.repository.CourseDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseDetailsService {
    private final CourseDetailsRepository courseDetailsRepository;

    public CourseDetailsService(CourseDetailsRepository courseDetailsRepository) {
        this.courseDetailsRepository = courseDetailsRepository;
    }

}
