package HighSchool.Headteacher.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Transactional
@NoArgsConstructor
@ToString

@Entity
@Table(name = "Teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int ID_Teacher;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private double salary;

    /*
    @OneToMany(targetEntity = SchoolClass.class,cascade = CascadeType.ALL)
    @JoinColumn(name="ID_Teacher",referencedColumnName = "id")
        List<SchoolClass> classes;*/
    @OneToOne(mappedBy = "teacher")
    private SchoolClass schoolClass;
}
