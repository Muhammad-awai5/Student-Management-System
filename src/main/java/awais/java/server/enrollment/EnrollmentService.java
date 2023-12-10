package awais.java.server.enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {
    List<Enrollment> getAllEnrollments();
    Optional<Enrollment> getEnrollmentById(Long enrollmentID);
    Enrollment createEnrollment(Enrollment enrollment);
    void deleteEnrollment(Long enrollmentID);
}
