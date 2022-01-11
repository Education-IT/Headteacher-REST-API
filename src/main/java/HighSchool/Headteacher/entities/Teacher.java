package HighSchool.Headteacher.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Data
@AllArgsConstructor
@Transactional
@NoArgsConstructor
@ToString
@Entity
@Table(name ="Teacher")
public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Teacher;
    private String name;
    private String surname;
    private double salary;
/*
@OneToMany(targetEntity = SchoolClass.class,cascade = CascadeType.ALL)
@JoinColumn(name="ID_Teacher",referencedColumnName = "id")
    List<SchoolClass> classes;*/
    @OneToOne(mappedBy = "teacher")
    private SchoolClass schoolClass;
}
