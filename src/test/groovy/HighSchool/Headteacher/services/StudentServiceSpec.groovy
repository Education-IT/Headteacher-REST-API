package HighSchool.Headteacher.services

import HighSchool.Headteacher.entities.SchoolClass
import HighSchool.Headteacher.entities.Student
import HighSchool.Headteacher.repositories.SchoolClassRepository
import HighSchool.Headteacher.repositories.StudentRepository
import spock.lang.Specification

class StudentServiceSpec extends Specification {
    def schoolClassRepository = Mock(SchoolClassRepository)
    def studentRepository = Mock(StudentRepository)
    def schoolClassService = Mock(SchoolClassService)
    def studentService = new StudentService(studentRepository, schoolClassService)

    def 'should save students'() {
        given:
        def student = new Student()
        def students = [student]

        when:
        studentService.saveStudents(students)

        then:
        1 * studentRepository.saveAll(students)
        0 * _
    }

    def 'should get students'(){
        when:
        studentService.getStudents()

        then:
        1 * studentRepository.findAll()
        0 * _

    }


    def 'should get student by surname'() {
        given:
        def surname = "surname"

        when:
        studentService.getStudentBySurname(surname)

        then:
        1* studentRepository.findBySurname(surname)
        0 * _
    }

    def 'should delete student by id'() {
        given:
        def id = 1

        when:
        studentService.deleteStudent(id)

        then:
        1 * studentRepository.deleteById(id)
        0 * _
    }



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
