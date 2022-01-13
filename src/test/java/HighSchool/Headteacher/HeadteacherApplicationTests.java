package HighSchool.Headteacher;

import HighSchool.Headteacher.entities.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
class HeadteacherApplicationTests {

    @Test
    @DisplayName("junit test test")
    void contextLoads() {
        Assertions.assertEquals(1, 1);
    }


}
