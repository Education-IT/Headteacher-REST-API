package HighSchool.Headteacher.repositories;


import HighSchool.Headteacher.entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class,Integer> {
}