package HighSchool.Headteacher.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.transaction.Transactional;
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
    @Column(name = "id")
    private int id_class;

    @Column(name = "name")
    private String name;

    @Column(name = "major")
    private String major;

/*
    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name="student-id",referencedColumnName = "id")
    private List<Student> students;
*/
    @JsonIgnore
    @OneToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkid_teacher", referencedColumnName = "id")
    private Teacher teacher;


    @JsonIgnore
    @OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkclass_id", referencedColumnName = "id")
    private List<Student> student;
}
