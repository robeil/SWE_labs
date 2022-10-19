package com.robeil.MyStudentMgmtApp.service;

import com.robeil.MyStudentMgmtApp.model.Classroom;

import java.util.List;

public interface ClassroomService {

    List<Classroom> getAllClassrooms();
    void addNewClassroom(Classroom classroom);

}
