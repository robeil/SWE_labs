package com.robeil.MyStudentMgmtApp.service.impl;

import com.robeil.MyStudentMgmtApp.model.Transcript;
import com.robeil.MyStudentMgmtApp.repository.TranscriptRepository;
import com.robeil.MyStudentMgmtApp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public void addNewTranscript(Transcript transcript) {
        transcriptRepository.save(transcript);
    }
    @Override
    public List<Transcript> getAllTranscript() {
        return transcriptRepository.findAll();
    }
}
