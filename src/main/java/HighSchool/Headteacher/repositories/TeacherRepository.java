package HighSchool.Headteacher.repositories;

import HighSchool.Headteacher.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Teacher findByName(String name);
}
