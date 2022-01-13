package HighSchool.Headteacher.services;

import HighSchool.Headteacher.entities.Student;
import HighSchool.Headteacher.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;
    private final SchoolClassService schoolClassService;

    public Student saveStudent(Student student, int classId) {
        student.setSchoolClass(schoolClassService.getSchoolClassById(classId));
        return repository.save(student);}

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);}

    public List<Student> getStudents() {
        return repository.findAll();}

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);}

    public Student getStudentBySurname(String surname) {
        return repository.findBySurname(surname);}

    public List<Student> getStudentsBySchoolClassId(int id) {
        return repository.findStudentBySchoolClassId(id);}

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed from database! Student's id: " + id;}

    public Student updateStudent(Student student) {
        Student existingStudent = repository.getById(student.getId());
        existingStudent.setName(student.getName());
        existingStudent.setSurname(student.getSurname());
        return repository.save(existingStudent);
    }
}
