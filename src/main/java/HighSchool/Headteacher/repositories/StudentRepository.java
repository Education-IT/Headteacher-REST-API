package HighSchool.Headteacher.repositories;

import HighSchool.Headteacher.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findBySurname(String surname);
}
