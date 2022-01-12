package HighSchool.Headteacher.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int ID_Student;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
    // private int ID_School_Class;
    // private int class_id;
}