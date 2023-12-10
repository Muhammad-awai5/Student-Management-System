package awais.java.server.student.entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional query methods can be added if needed
}
