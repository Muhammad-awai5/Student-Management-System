// CourseService.java
package awais.java.server.school;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long courseID);
    Course createCourse(Course course);
    void deleteCourse(Long courseID);
}
