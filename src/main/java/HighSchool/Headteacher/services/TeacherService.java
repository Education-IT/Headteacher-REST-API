package HighSchool.Headteacher.services;

import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;

    public Teacher saveTeacher(Teacher teacher){
       return repository.save(teacher);
    }

    public List<Teacher> saveTeachers(List<Teacher> teachers){
        return repository.saveAll(teachers);
    }

public List<Teacher> getTeachers(){
        return repository.findAll();
}

    public Teacher getTeacherById(int id){
        return repository.findById(id).orElse(null);
    }

    public Teacher getTeacherByName(String Name){
        return repository.findByName(Name);
    }

    public String deleteTeahcer(int id){
        repository.deleteById(id);
        return "Teacher removed!" + id;
    }

    public Teacher updateTeacher(Teacher teacher){
        Teacher existingTeahcer=repository.findById(teacher.getID_Teacher()).orElse(null);
        existingTeahcer.setName(teacher.getName());
        existingTeahcer.setSalary(teacher.getSalary());
        existingTeahcer.setSurname(teacher.getSurname());
        return repository.save(existingTeahcer);
    }

}
