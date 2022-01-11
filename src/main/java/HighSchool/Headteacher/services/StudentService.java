package HighSchool.Headteacher.services;


import HighSchool.Headteacher.entities.Student;
import HighSchool.Headteacher.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    public Student getStudentBySurname(String surname){
        return repository.findBySurname(surname);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student removed from database! Student's id: " + id;
    }

    public Student updateStudent(Student student){
        Student existingStudent=repository.findById(student.getID_Student()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setID_Class(student.getID_Class());
        existingStudent.setSurname(student.getSurname());
        return repository.save(existingStudent);

    }



}
