package HighSchool.Headteacher.services

import HighSchool.Headteacher.entities.Student
import HighSchool.Headteacher.repositories.StudentRepository
import spock.lang.Specification

class StudentServiceSpec extends Specification {

    def studentRepository = Mock(StudentRepository)
    def schoolClassService = Mock(SchoolClassService)
    def studentService = new StudentService(studentRepository, schoolClassService)

    def 'should update student'() {
        given:
        def student = Mock(Student)
        def existingStudent = Mock(Student)

        when:
        studentService.updateStudent(student)

        then:
        1 * student.getId() >> 1
        1 * studentRepository.getById(1) >> existingStudent
        1 * student.getName() >> 'name'
        1 * existingStudent.setName('name')
        1 * student.getSurname() >> 'surname'
        1 * existingStudent.setSurname('surname')
        1 * studentRepository.save(existingStudent)
        0 * _
    }
}
