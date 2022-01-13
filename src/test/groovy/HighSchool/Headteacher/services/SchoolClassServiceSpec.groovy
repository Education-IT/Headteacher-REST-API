package HighSchool.Headteacher.services

import HighSchool.Headteacher.entities.SchoolClass
import HighSchool.Headteacher.repositories.SchoolClassRepository
import spock.lang.Specification

class SchoolClassServiceSpec extends Specification{

    def schoolClassRepository = Mock(SchoolClassRepository)
    def teacherService = Mock(TeacherService)
    def schoolClassService = new SchoolClassService(schoolClassRepository, teacherService)

    def 'should update school class'(){
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
