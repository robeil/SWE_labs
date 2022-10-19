package com.robeil.MyStudentMgmtApp.service;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.model.Student;
import com.robeil.MyStudentMgmtApp.model.Transcript;

import java.util.List;


public interface StudentService {

    void saveStudent(Student student);

    List<Student> getAllStudents();








}
