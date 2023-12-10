// CourseController.java
package awais.java.server.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{courseID}")
    public Course getCourseById(@PathVariable Long courseID) {
        return courseService.getCourseById(courseID).orElse(null);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @DeleteMapping("/{courseID}")
    public void deleteCourse(@PathVariable Long courseID) {
        courseService.deleteCourse(courseID);
    }
}
