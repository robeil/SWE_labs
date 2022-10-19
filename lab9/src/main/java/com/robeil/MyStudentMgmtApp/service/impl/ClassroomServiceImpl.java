package com.robeil.MyStudentMgmtApp.service.impl;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import com.robeil.MyStudentMgmtApp.repository.ClassroomRepository;
import com.robeil.MyStudentMgmtApp.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public void addNewClassroom(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }
}
