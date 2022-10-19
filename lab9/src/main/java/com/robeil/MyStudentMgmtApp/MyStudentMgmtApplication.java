package com.robeil.MyStudentMgmtApp;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.model.Student;
import com.robeil.MyStudentMgmtApp.model.Transcript;
import com.robeil.MyStudentMgmtApp.service.ClassroomService;
import com.robeil.MyStudentMgmtApp.service.StudentService;
import com.robeil.MyStudentMgmtApp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TranscriptService transcriptService;
    @Autowired
    public ClassroomService classroomService;


    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * Creating 5 Transcript
         */
        Transcript transcript1 = new Transcript(101L,"Computer Science");
        Transcript transcript2 = new Transcript(102L,"Computer Science");
        Transcript transcript3 = new Transcript(103L,"Computer Science");
        Transcript transcript4 = new Transcript(104L,"Computer Science");
        Transcript transcript5 = new Transcript(105L,"Computer Science");

        /**
         * Creating 5 Student
         */
        Student student1 = new Student(1001L,"000-61-0001","Anna","Lynn","Smith",3.2,LocalDate.of(2021,8,10));
        Student student2 = new Student(1002L,"000-62-0002","Anna","Lynn","Smith",3.4,LocalDate.of(2021,8,10));
        Student student3 = new Student(1003L,"000-63-0003","Anna","Lynn","Smith",3.4,LocalDate.of(2021,8,10));
        Student student4 = new Student(1004L,"000-64-0004","Anna","Lynn","Smith",3.6,LocalDate.of(2021,8,10));
        Student student5 = new Student(1005L,"000-65-0005","Anna","Lynn","Smith",3.8,LocalDate.of(2021,8,10));



        /**
         * List of students
         */
        List<Student> firstGroup = new ArrayList<>();
        firstGroup.add(student1);
        firstGroup.add(student2);
        List<Student> secondGroup = new ArrayList<>();
        secondGroup.add(student3);
        secondGroup.add(student4);
        secondGroup.add(student5);

        /**
         * Creating Classroom
         */
        Classroom classroom1 = new Classroom(201L,"Verill Hall",47,firstGroup);
        Classroom classroom2 = new Classroom(202L,"Library",11,secondGroup);

        /**
         * Saving classroom
         */
        classroomService.addNewClassroom(classroom1);
        classroomService.addNewClassroom(classroom2);
        /**
         * set studetn classroom
         */
       classroom1.setStudents(firstGroup);
       classroom2.setStudents(secondGroup);

        /**
         * Saving the new Student
         */
        studentService.saveStudent(student1);
        studentService.saveStudent(student2);
        studentService.saveStudent(student3);
        studentService.saveStudent(student4);
        studentService.saveStudent(student5);
        /**
         * setting transcript to student table
         */
        transcript1.setTranscriptId(student1.getId());
        transcript2.setTranscriptId(student2.getId());
        transcript3.setTranscriptId(student3.getId());
        transcript4.setTranscriptId(student4.getId());
        transcript5.setTranscriptId(student5.getId());


        /**
         * setting classroom to student table
         */
        classroom1.setClassroomId(student1.getId());
        classroom1.setClassroomId(student1.getId());

        /**
         * Saving transcript
         */
        transcriptService.addNewTranscript(transcript1);
        transcriptService.addNewTranscript(transcript2);
        transcriptService.addNewTranscript(transcript3);
        transcriptService.addNewTranscript(transcript4);
        transcriptService.addNewTranscript(transcript4);



    }
}
