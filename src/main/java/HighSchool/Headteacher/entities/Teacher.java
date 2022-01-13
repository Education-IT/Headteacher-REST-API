package HighSchool.Headteacher.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Transactional
@NoArgsConstructor
@Entity
@Table(name = "Teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String surname;

    private double salary;

    @JsonIgnore
    @OneToOne(mappedBy = "teacher")
    private SchoolClass schoolClass;
}
