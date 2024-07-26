package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.model.CourseDetails;
import edu.miu.cs.cs425.repository.CourseDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailsImpl implements CourseDetailService{
    private final CourseDetailsRepository courseDetailsRepository;

    public CourseDetailsImpl(CourseDetailsRepository courseDetailsRepository) {
        this.courseDetailsRepository = courseDetailsRepository;
    }


    public void updateCourseDetails(CourseDetails courseDetails) {
         courseDetailsRepository.save(courseDetails);
    }

    @Override
    public List<CourseDetails> findAllCourseDetails() {
        return courseDetailsRepository.findAll();
    }


    public void deleteCourseDetails(Integer descriptionId) {
        courseDetailsRepository.deleteById(descriptionId);
    }

    public List<CourseDetails> getCourseDetailsByCourse(CourseDetails courseDetails) {
            return null;
    }

    public void saveCourseDetails(CourseDetails courseDetails) {
      courseDetailsRepository.save(courseDetails);
    }

    public List<CourseDetails> getAllCourseDetails() {
            return courseDetailsRepository.findAll();
    }

    public CourseDetails getCourseDetails(CourseDetails courseDetails) {
            return courseDetailsRepository.getOne(courseDetails.getDescriptionId());
    }
}
