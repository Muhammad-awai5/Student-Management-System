// CourseRepository.java
package awais.java.server.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // You can add custom query methods if needed
}
