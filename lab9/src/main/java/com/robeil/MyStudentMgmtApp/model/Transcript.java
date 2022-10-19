package com.robeil.MyStudentMgmtApp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;
    private String degreeTitle;

    @ManyToOne
    @JsonBackReference
    private Student student;

    @Override
    public String toString(){
        return String.format("TranscriptId: %i,DegreeTitle: %s",
                this.transcriptId,
                this.degreeTitle
        );
    }
}
