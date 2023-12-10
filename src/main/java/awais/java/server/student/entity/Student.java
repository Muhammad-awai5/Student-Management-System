package awais.java.server.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "Student")  // Corrected table name to match the actual table name
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentId;
    private String firstName;
    private String lastName;
    //private String email;

    // Constructors

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.StudentId = StudentId;
    	this.firstName = firstName;
        this.lastName = lastName;
       // this.email = email;
    }

    // Getters and setters

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        this.StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
}
