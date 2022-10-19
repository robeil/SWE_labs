package com.robeil.MyStudentMgmtApp.service.impl;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.model.Student;
import com.robeil.MyStudentMgmtApp.model.Transcript;
import com.robeil.MyStudentMgmtApp.repository.ClassroomRepository;
import com.robeil.MyStudentMgmtApp.repository.StudentRepository;
import com.robeil.MyStudentMgmtApp.repository.TranscriptRepository;
import com.robeil.MyStudentMgmtApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
