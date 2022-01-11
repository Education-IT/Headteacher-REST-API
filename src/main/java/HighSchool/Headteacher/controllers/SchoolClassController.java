package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.services.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolClassController {
    @Autowired
    private SchoolClassService service;

    @PostMapping("/addschoolclass")
    public SchoolClass addSchoolClass(@RequestBody SchoolClass schoolclass){
        return service.saveSchoolClass(schoolclass);
    }
    @PostMapping("/addschoolclasses")
    public List<SchoolClass> addSchoolClasses(@RequestBody List<SchoolClass> schoolclasses){
        return service.saveSchoolClasses(schoolclasses);
    }

    @GetMapping("/schollclasses")
    public List<SchoolClass> findAllSchollClasses(){
        return service.getSchoolClasses();
    }
    @GetMapping("/schoolclassById/{id}")
    public SchoolClass findSchoolClassById(@PathVariable int id){
        return service.getSchoolClassById(id);}
    @GetMapping("/schoolclassByName/{name}")
    public SchoolClass findSchoolClassByName(@PathVariable String name){
        return service.getSchoolClassByName(name);}


    @PutMapping("/update/schoolclass")
    public SchoolClass upSchoolClass(@RequestBody SchoolClass schoolclass){
        return service.updateSchoolClass(schoolclass);
    }

    @DeleteMapping("/delete/schoolclass/{id}")
    public String deleteSchoolClass(@PathVariable int id){
        return service.deleteSchoolClassById(id);
    }



}