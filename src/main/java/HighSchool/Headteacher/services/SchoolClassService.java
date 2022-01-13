package HighSchool.Headteacher.services;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.repositories.SchoolClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolClassService {

    private final SchoolClassRepository repository;
    private final TeacherService teacherService;

    public SchoolClass saveSchoolClass(SchoolClass schoolclass) {
        return repository.save(schoolclass);
    }

    public List<SchoolClass> saveSchoolClasses(List<SchoolClass> schoolclasses) {
        return repository.saveAll(schoolclasses);
    }

    public List<SchoolClass> getSchoolClasses() {
        return repository.findAll();
    }

    public SchoolClass getSchoolClassById(int id) {
        return repository.getById(id);
    }

    public SchoolClass getSchoolClassByName(String name) {
        return repository.findByName(name);
    }

    public String deleteSchoolClassById(int id) {
        repository.deleteById(id);
        return "School class - id:" + id + " removed!";
    }

    public SchoolClass updateSchoolClass(SchoolClass schoolclass) {
        SchoolClass existingSchoolClass = repository.getById(schoolclass.getId());
        existingSchoolClass.setName(schoolclass.getName());
        existingSchoolClass.setMajor(schoolclass.getMajor());
        return repository.save(existingSchoolClass);
    }

    @Transactional
    public void assignTeacherToClass(int teacherId, int classId) {
        Teacher teacherById = teacherService.getTeacherById(teacherId);
        SchoolClass schoolClassById = getSchoolClassById(classId);
        teacherById.setSchoolClass(schoolClassById);
        schoolClassById.setTeacher(teacherById);
    }

}
