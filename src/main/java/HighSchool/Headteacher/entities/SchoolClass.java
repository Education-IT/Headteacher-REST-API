package HighSchool.Headteacher.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="SchoolClass")
public class SchoolClass {
    @Id
    @GeneratedValue
    private int ID_Class;
    private String name;
    private int numberOfStudents;
    //private int ID_Teacher;
/*
    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name="ID_Teacher",referencedColumnName = "id")
    private List<Student> students;
*/


}
