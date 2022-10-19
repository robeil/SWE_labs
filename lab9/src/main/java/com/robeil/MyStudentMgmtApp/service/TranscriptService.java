package com.robeil.MyStudentMgmtApp.service;

import com.robeil.MyStudentMgmtApp.model.Transcript;

import java.util.List;

public interface TranscriptService {

    void addNewTranscript(Transcript transcript);
    List<Transcript> getAllTranscript();
}
