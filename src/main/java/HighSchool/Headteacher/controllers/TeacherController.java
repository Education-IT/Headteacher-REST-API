package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
@Autowired
private TeacherService service;

@PostMapping("/addteacher")
public Teacher addTeacher(@RequestBody Teacher teacher){
return service.saveTeacher(teacher);
}
    @PostMapping("/addteachers")
    public List<Teacher> addTeachers(@RequestBody List<Teacher> teachers){
        return service.saveTeachers(teachers);
    }

    @GetMapping("/teachers")
    public List<Teacher> findAllTeachers(){
    return service.getTeachers();
    }
    @GetMapping("/teacherById/{id}")
    public Teacher findTeacherById(@PathVariable int id){
    return service.getTeacherById(id);}
    @GetMapping("/teacherByName/{name}")
    public Teacher findTeacherByName(@PathVariable String name){
        return service.getTeacherByName(name);}


    @PutMapping("/update/teacher")
    public Teacher upTeacher(@RequestBody Teacher teacher){
        return service.updateTeacher(teacher);
    }

    @DeleteMapping("/delete/teacher/{id}")
   public String deleteTeacher(@PathVariable int id){
    return service.deleteTeahcer(id);
   }



}
