package com.robeil.MyStudentMgmtApp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Input should be:eg. 000-61-0002")
    private String studentNumber;
    @Column(nullable = false)
    @NotNull(message = "Input should be:eg. Anna, Rob etc")
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    @NotNull(message = "Input should be:eg. Anna, Rob etc")
    private String lastName;
    private double cgpa;
    private LocalDate dateOfEnrollment;

    @OneToOne(mappedBy = "student")
    private Transcript transcript;

    @ManyToOne
    @JoinColumn
    private Classroom classroom;

    public Student(Long id, String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String toString(){
        return String.format("StudentNumber: %s, FirstName: %s,middleName: %s, LastName: %s,GPA: %d,DateOfEnrolled: %date",
                this.studentNumber,
                this.firstName,
                this.middleName,
                this.lastName,
                this.cgpa,
                this.dateOfEnrollment
        );
    }
}
