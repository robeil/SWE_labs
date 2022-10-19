package com.robeil.MyStudentMgmtApp.model;

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

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "student_id")
    private List<Transcript> transcripts;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "student_id")
    private List<Classroom> classrooms;

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
