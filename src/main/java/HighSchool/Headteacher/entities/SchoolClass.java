package HighSchool.Headteacher.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@ToString
@Entity
@Table(name = "School_classes")
public class SchoolClass {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String major;

    @OneToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Teacher teacher;
}
