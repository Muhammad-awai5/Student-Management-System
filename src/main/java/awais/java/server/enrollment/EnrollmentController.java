package awais.java.server.enrollment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{enrollmentID}")
    public Enrollment getEnrollmentById(@PathVariable Long enrollmentID) {
        return enrollmentService.getEnrollmentById(enrollmentID).orElse(null);
    }

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.createEnrollment(enrollment);
    }

    @DeleteMapping("/{enrollmentID}")
    public void deleteEnrollment(@PathVariable Long enrollmentID) {
        enrollmentService.deleteEnrollment(enrollmentID);
    }
}
