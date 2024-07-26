package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.CourseDetails;

import java.util.List;

public interface CourseDetailService {
    void saveCourseDetails(CourseDetails courseDetails);
    void deleteCourseDetails(Integer descriptionId);
    void updateCourseDetails(CourseDetails courseDetails);
    List<CourseDetails> findAllCourseDetails();
}
