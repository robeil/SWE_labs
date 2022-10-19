package com.robeil.MyStudentMgmtApp.repository;

import com.robeil.MyStudentMgmtApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
