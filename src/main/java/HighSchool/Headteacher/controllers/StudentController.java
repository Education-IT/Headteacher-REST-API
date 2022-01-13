package HighSchool.Headteacher.controllers;


import HighSchool.Headteacher.entities.Student;
import HighSchool.Headteacher.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping(value = "/addstudent/class/{classId}")
    public Student addStudent(@RequestBody Student student, @PathVariable int classId) {
        return service.saveStudent(student, classId);
    }

    @PostMapping(value = "/addstudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping(value = "/studentById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @GetMapping(value = "/studentByName/{surname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student findStudentBySurname(@PathVariable String surname) {
        return service.getStudentBySurname(surname);
    }


    @PutMapping(value = "/update/student")
    public Student upStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping(value = "/delete/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

}
