package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.repositories.SchoolClassRepository;
import HighSchool.Headteacher.services.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolClassController {
    @Autowired
    private SchoolClassService service;

    @Autowired
    private SchoolClassRepository repository;

    @PostMapping(value = "/addschoolclass")
    public SchoolClass addSchoolClass(@RequestBody SchoolClass schoolclass) {
        //return service.saveSchoolClass(schoolclass);
        return repository.save(schoolclass);
    }

    @PostMapping(value = "/addschoolclasses")
    public ResponseEntity<String> addSchoolClasses(@RequestBody List<SchoolClass> schoolclasses) {
        //public List<SchoolClass> addSchoolClasses(@RequestBody List<SchoolClass> schoolclasses){
        //return service.saveSchoolClasses(schoolclasses);
        repository.saveAll(schoolclasses);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping(value = "/schollclasses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SchoolClass> findAllSchollClasses() {
        return service.getSchoolClasses();
    }

    @GetMapping(value = "/schoolclassById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SchoolClass findSchoolClassById(@PathVariable int id) {
        return service.getSchoolClassById(id);
    }

    @GetMapping(value = "/schoolclassByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SchoolClass findSchoolClassByName(@PathVariable String name) {
        return service.getSchoolClassByName(name);
    }


    @PutMapping(value = "/update/schoolclass")
    public SchoolClass upSchoolClass(@RequestBody SchoolClass schoolclass) {
        return service.updateSchoolClass(schoolclass);
    }

    @DeleteMapping(value = "/delete/schoolclass/{id}")
    public String deleteSchoolClass(@PathVariable int id) {
        return service.deleteSchoolClassById(id);
    }


}
