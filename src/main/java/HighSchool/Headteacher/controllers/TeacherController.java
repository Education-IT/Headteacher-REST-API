package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService service;

    @PostMapping(value = "/addteacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return service.saveTeacher(teacher);
    }

    @PostMapping(value = "/addteachers")
    public List<Teacher> addTeachers(@RequestBody List<Teacher> teachers) {
        return service.saveTeachers(teachers);
    }

    @GetMapping(value = "/teachers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> findAllTeachers() {
        return service.getTeachers();
    }

    @GetMapping(value = "/teacherById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher findTeacherById(@PathVariable int id) {
        return service.getTeacherById(id);
    }

    @GetMapping(value = "/teacherByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher findTeacherByName(@PathVariable String name) {
        return service.getTeacherByName(name);
    }

    @PutMapping(value = "/update/teacher")
    public Teacher upTeacher(@RequestBody Teacher teacher) {
        return service.updateTeacher(teacher);
    }

    @DeleteMapping(value = "/delete/teacher/{id}")
    public String deleteTeacher(@PathVariable int id) {
        return service.deleteTeacher(id);
    }

}
