package com.robeil.MyStudentMgmtApp.controller;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.model.Student;
import com.robeil.MyStudentMgmtApp.model.Transcript;
import com.robeil.MyStudentMgmtApp.service.ClassroomService;
import com.robeil.MyStudentMgmtApp.service.StudentService;
import com.robeil.MyStudentMgmtApp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentMgmt")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private TranscriptService transcriptService;


    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students/transcript")
    public void addNewTranscript(@RequestBody Transcript transcript){
       transcriptService.addNewTranscript(transcript);
    }

    @GetMapping("/students/transcript")
    public List<Transcript> getAllTranscript(){
        return transcriptService.getAllTranscript();
    }

    @PostMapping("/students/classrooms")
    public void addNewClassroom(@RequestBody Classroom classroom){
        classroomService.addNewClassroom(classroom);
    }

    @GetMapping("/students/classrooms")
    public List<Classroom> getAllClassrooms(){
        return classroomService.getAllClassrooms();
    }
}
