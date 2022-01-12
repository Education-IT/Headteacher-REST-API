package HighSchool.Headteacher.repositories;


import HighSchool.Headteacher.entities.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Integer> {
    SchoolClass findByName(String name);
}