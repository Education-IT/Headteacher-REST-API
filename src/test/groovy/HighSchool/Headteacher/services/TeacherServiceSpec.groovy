package HighSchool.Headteacher.services

import HighSchool.Headteacher.entities.Teacher
import HighSchool.Headteacher.repositories.TeacherRepository
import spock.lang.Specification

class TeacherServiceSpec extends Specification {

    def teacherRepository = Mock(TeacherRepository)
    def teacherService = new TeacherService(teacherRepository)

    def 'should save teacher'() {
        given:
        def teacher = new Teacher()

        when:
        teacherService.saveTeacher(teacher)

        then:
        1 * teacherRepository.save(teacher)
        0 * _
    }

    def 'should save teachers'() {
        given:
        def teacher = new Teacher()
        def teachers = [teacher]

        when:
        teacherService.saveTeachers(teachers)

        then:
        1 * teacherRepository.saveAll(teachers)
        0 * _
    }

    def 'should get teachers'() {
        when:
        teacherService.getTeachers()

        then:
        1 * teacherRepository.findAll()
        0 * _
    }

    def 'should get teacher by id'() {
        given:
        def id = 1

        when:
        teacherService.getTeacherById(id)

        then:
        1 * teacherRepository.getById(id)
        0 * _
    }

    def 'should get teacher by name'() {
        given:
        def name = "name"

        when:
        teacherService.getTeacherByName(name)

        then:
        1 * teacherRepository.findByName(name)
        0 * _
    }

    def 'should delete teacher by id'() {
        given:
        def id = 1

        when:
        teacherService.deleteTeacher(id)

        then:
        1 * teacherRepository.deleteById(id)
        0 * _
    }

    def 'should update teacher'() {
        given:
        def teacher = Mock(Teacher)
        def existingTeacher = Mock(Teacher)

        when:
        teacherService.updateTeacher(teacher)

        then:
        1 * teacher.getId() >> 1
        1 * teacherRepository.getById(1) >> existingTeacher
        1 * teacher.getName() >> 'name'
        1 * existingTeacher.setName('name')
        1 * teacher.getSalary() >> 1
        1 * existingTeacher.setSalary(1)
        1 * teacher.getSurname() >> 'surname'
        1 * existingTeacher.setSurname('surname')
        1 * teacherRepository.save(existingTeacher)
        0 * _
    }

}
