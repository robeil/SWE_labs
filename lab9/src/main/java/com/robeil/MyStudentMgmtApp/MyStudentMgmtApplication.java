package com.robeil.MyStudentMgmtApp;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.model.Student;
import com.robeil.MyStudentMgmtApp.model.Transcript;
import com.robeil.MyStudentMgmtApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtApplication
        //implements CommandLineRunner
{

//    @Autowired
//    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        var transcript = new Transcript(null,"Computer Science");
//        var classroom = new Classroom(null,"Verill Hall",47);
//
//        List<Transcript> listOfTranscript = new ArrayList();
//        List<Classroom> listOfClassRoom = new ArrayList<>();
//
//        listOfClassRoom.add(classroom);
//        listOfTranscript.add(transcript);
//
//        Student newStudent = new Student(null,"011663","Meron","T/mariam","Tekle",3.8, LocalDate.of(2021,8,10),
//                listOfTranscript ,listOfClassRoom);
//        /**
//         * Saving the new Student
//         */
//        studentService.saveStudent(newStudent);
//
//    }
}
