package com.robeil.MyStudentMgmtApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;
    private String buildingName;
    private int roomNumber;

    @OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Student> students;


    @Override
    public String toString() {
        return String.format("ClassroomID: &d, BuildingName: %s, RoomNumber: %d",
                this.classroomId,
                this.buildingName,
                this.roomNumber
        );
    }
}
