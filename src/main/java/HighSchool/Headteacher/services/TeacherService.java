package HighSchool.Headteacher.services;

import HighSchool.Headteacher.entities.Teacher;
import HighSchool.Headteacher.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;

    public Teacher saveTeacher(Teacher teacher) {
        return repository.save(teacher);}

    public List<Teacher> saveTeachers(List<Teacher> teachers) {
        return repository.saveAll(teachers);}

    public List<Teacher> getTeachers() {
        return repository.findAll();}

    public Teacher getTeacherById(int id) {
        return repository.getById(id);}

    public Teacher getTeacherByName(String name) {
        return repository.findByName(name);}

    public String deleteTeacher(int id) {
        repository.deleteById(id);
        return "Teacher removed! (His id: " + id + ")";}

    public Teacher updateTeacher(Teacher teacher) {
        Teacher existingTeacher = repository.getById(teacher.getId());
        existingTeacher.setName(teacher.getName());
        existingTeacher.setSalary(teacher.getSalary());
        existingTeacher.setSurname(teacher.getSurname());
        return repository.save(existingTeacher);}
}
