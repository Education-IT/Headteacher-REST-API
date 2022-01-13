package HighSchool.Headteacher.services

import HighSchool.Headteacher.entities.SchoolClass
import HighSchool.Headteacher.repositories.SchoolClassRepository
import spock.lang.Specification

class SchoolClassServiceSpec extends Specification {

    def schoolClassRepository = Mock(SchoolClassRepository)
    def teacherService = Mock(TeacherService)
    def schoolClassService = new SchoolClassService(schoolClassRepository, teacherService)

    def 'should save class'() {
        given:
        def schoolClass = new SchoolClass()

        when:
        schoolClassService.saveSchoolClass(schoolClass)

        then:
        1 * schoolClassRepository.save(schoolClass)
    }

    def 'should save schoolclasses'() {
        given:
        def schoolClass = new SchoolClass()
        def schoolClasses = [schoolClass]

        when:
        schoolClassService.saveSchoolClasses(schoolClasses)

        then:
        1 * schoolClassRepository.saveAll(schoolClasses)
        0 * _

    }

    def "should get schoolclasses"() {
        when:
        schoolClassService.getSchoolClasses()

        then:
        1 * schoolClassRepository.findAll()
        0 * _
    }

    def 'should get schoolclass by id'() {
        given:
        def id = 1

        when:
        schoolClassService.getSchoolClassById(id)

        then:
        1 * schoolClassRepository.getById(id)
        0 * _
    }

    def 'should get schoolclass by name'() {
        given:
        def name = "name"

        when:
        schoolClassService.getSchoolClassByName(name)

        then:
        1 * schoolClassRepository.findByName(name)
        0 * _
    }

    def 'should delete schoolclass by id'() {
        given:
        def id = 1

        when:
        schoolClassService.deleteSchoolClassById(id)

        then:
        1 * schoolClassRepository.deleteById(id)
        0 * _

    }


    def 'should update school class'() {
        given:
        def schoolClass = Mock(SchoolClass)
        def existingSchoolClass = Mock(SchoolClass)

        when:
        schoolClassService.updateSchoolClass(schoolClass)

        then:
        1 * schoolClass.getId() >> 1
        1 * schoolClassRepository.getById(1) >> existingSchoolClass
        1 * schoolClass.getName() >> 'name'
        1 * existingSchoolClass.setName('name')
        1 * schoolClass.getMajor() >> 'major'
        1 * existingSchoolClass.setMajor('major')
        1 * schoolClassRepository.save(existingSchoolClass)
        0 * _
    }

}
