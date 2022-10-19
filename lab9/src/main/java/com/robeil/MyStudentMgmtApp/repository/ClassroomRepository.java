package com.robeil.MyStudentMgmtApp.repository;

import com.robeil.MyStudentMgmtApp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
