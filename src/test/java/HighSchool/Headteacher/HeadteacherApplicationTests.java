package HighSchool.Headteacher;

import HighSchool.Headteacher.entities.SchoolClass;
import HighSchool.Headteacher.entities.Student;
import HighSchool.Headteacher.entities.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spock.lang.Ignore;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
class HeadteacherApplicationTests {

    @Test
    @DisplayName("junit test test")
    void contextLoads() {
        Assertions.assertEquals(1, 1);
    }


    @Test
    @DisplayName("should create student object")
    void createStudent() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Krystian");
        student1.setSurname("Osiński");
        student1.setSchoolClass(new SchoolClass());
        Student student2 = new Student(1, "Krystian", "Osiński", new SchoolClass());

        Assertions.assertEquals(student1, student2);

    }


    @Test
    @DisplayName("should create teacher object")
    void createTeacher() {
        Teacher teacher1 = new Teacher();
        teacher1.setId(1);
        teacher1.setName("Szymon");
        teacher1.setSurname("Ptaszyński");
        teacher1.setSalary(6750);
        teacher1.setSchoolClass(new SchoolClass());

        Teacher teacher2 = new Teacher(1, "Szymon", "Ptaszyński", 6750, new SchoolClass());
        Assertions.assertEquals(teacher1, teacher2);
    }

    @Test
    @DisplayName("should create schooclass object")
    void createSchoolClass() {
        SchoolClass schoolClass1 = new SchoolClass();
        schoolClass1.setId(1);
        schoolClass1.setName("UAM");
        schoolClass1.setMajor("Computer Science");
        schoolClass1.setTeacher(new Teacher());

        SchoolClass schoolClass2 = new SchoolClass(1, "UAM", "Computer Science", new Teacher());
        Assertions.assertEquals(schoolClass1, schoolClass2);


    }
}
