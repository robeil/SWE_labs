package com.robeil.MyStudentMgmtApp.repository;

import com.robeil.MyStudentMgmtApp.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends JpaRepository<Transcript,Long> {

}
