package HighSchool.Headteacher.services;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.repositories.SchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassService {
    @Autowired
    private SchoolClassRepository repository;

    public SchoolClass saveSchoolClass(SchoolClass schoolclass) {
        return repository.save(schoolclass);
    }

    public List<SchoolClass> saveSchoolClasses(List<SchoolClass> schoolclasses) {
        return repository.saveAll(schoolclasses);}

    public List<SchoolClass> getSchoolClasses() {
        return repository.findAll();
    }

    public SchoolClass getSchoolClassById(int id) {
        return repository.findById(id).orElse(null);
    }

    public SchoolClass getSchoolClassByName(String name) {
        return repository.findByName(name);
    }

    public String deleteSchoolClassById(int id) {
        repository.deleteById(id);
        return "School class - id:" + id + " removed!";}

    public SchoolClass updateSchoolClass(SchoolClass schoolclass) {
        SchoolClass existingSchoolClass = repository.findById(schoolclass.getId_class()).orElse(null);
        // existingSchoolClass.setID_Teacher(schoolclass.getID_Teacher());
        existingSchoolClass.setName(schoolclass.getName());
        return repository.save(existingSchoolClass);

    }

}
