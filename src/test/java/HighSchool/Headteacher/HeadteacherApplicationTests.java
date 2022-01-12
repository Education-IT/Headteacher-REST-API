package HighSchool.Headteacher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HeadteacherApplicationTests {

    @Test
    @DisplayName("Nauka testowania z mapowaniem")
    void contextLoads() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @Disabled("Not implemented yet")
    void createStudentsTable() {
    }


}
