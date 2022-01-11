package HighSchool.Headteacher.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Student")
public class Student {
    @Id
    @GeneratedValue
    private int ID_Student;
    private String name;
    private String surname;
    private int ID_Class;

    @ManyToOne
    @JoinColumn(name = "ID_Class",referencedColumnName="id_class",insertable=false, updatable=false)
    private Class _class;

}
