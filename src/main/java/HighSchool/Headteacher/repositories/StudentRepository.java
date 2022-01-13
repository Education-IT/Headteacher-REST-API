package HighSchool.Headteacher.repositories;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findBySurname(String surname);
    List<Student> findStudentBySchoolClassId(int id);
}
