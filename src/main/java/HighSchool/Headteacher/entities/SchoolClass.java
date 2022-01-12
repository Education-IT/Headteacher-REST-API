package HighSchool.Headteacher.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@ToString
@Entity
@Table(name = "School_classes")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_class;
    private String name;
    private String major;
    //private int ID_Teacher;
/*
    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name="student-id",referencedColumnName = "id")
    private List<Student> students;
*/
    @JsonIgnore
    @OneToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_teacher", referencedColumnName = "id_teacher")
    private Teacher teacher;


    @JsonIgnore
    @OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_class_id", referencedColumnName = "id_class")
    private List<Student> student;
}
