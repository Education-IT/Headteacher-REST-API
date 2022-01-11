package HighSchool.Headteacher.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Class")
public class Class {
    @Id
    @GeneratedValue
    private int ID_Class;
    private String name;
    private int numberOfStudents;
    private int ID_Teacher;

    @OneToMany
    @JoinColumn(name = "ID_Class",referencedColumnName="id_class",insertable=false, updatable=false)
    private Set<Student> students;

}
