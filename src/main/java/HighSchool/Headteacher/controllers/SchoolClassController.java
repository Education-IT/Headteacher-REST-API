package HighSchool.Headteacher.controllers;

import HighSchool.Headteacher.dto.AssignDto;
import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.services.SchoolClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolClassController {
    private final SchoolClassService service;

    @PostMapping("/addschoolclass")
    public SchoolClass addSchoolClass(@RequestBody SchoolClass schoolclass) {
        return service.saveSchoolClass(schoolclass);
    }

    @PostMapping("/addschoolclasses")
    public List<SchoolClass> addSchoolClasses(@RequestBody List<SchoolClass> schoolclasses) {
        return service.saveSchoolClasses(schoolclasses);
    }

    @GetMapping("/schollclasses")
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

    @PatchMapping("teacher")
    public void assignTeacherToClass(@RequestBody AssignDto assignDto) {
        service.assignTeacherToClass(assignDto.getTeacherId(), assignDto.getClassId());
    }
}
