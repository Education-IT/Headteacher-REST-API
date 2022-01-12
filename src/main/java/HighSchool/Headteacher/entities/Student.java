package HighSchool.Headteacher.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private int ID_Student;
    private String name;
    private String surname;
    // private int ID_School_Class;
    // private int class_id;

}