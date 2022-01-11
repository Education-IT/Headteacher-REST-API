package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.entities.Student;
import HighSchool.Headteacher.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @PostMapping("/addstudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);}

    @GetMapping("/studentByName/{surname}")
    public Student findStudentBySurname(@PathVariable String surname){
        return service.getStudentBySurname(surname);}


    @PutMapping("/update/student")
    public Student upStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/student/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }



}
