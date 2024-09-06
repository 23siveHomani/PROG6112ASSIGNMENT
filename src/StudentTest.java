import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class StudentTests {
    private String student;
    private int age;
    private String email;
    private int ID;

    @org.junit.jupiter.api.BeforeEach
    void TestSaveStudent() {
//Create a new student
        String studentId = "2004";
        String name = "Asive";
        int age = 19;
        String email = "st10441554@rcconnect.edu.za";
        String course = "Software Developmemt";


    }

    @org.junit.jupiter.api.AfterEach
    void TestSearchStudent() {


    }

    @Test
    void TestSearchStudent_StudentNotFound() {
    }


    @Test
    void TestDeleteStudent() {
    }


    @Test
    void TestDeleteStudent_StudentNotFound() {
    }


    @Test
    void TestStudentAge_StudentAgeValid() {

        int validAge = 18;
        boolean isValidAge = validAge >= 16;
        assertTrue(isValidAge, "Age should be valid");


    }


    @Test
    void TestStudentAge_StudentAgeInvalid() {
    }


    @Test
    void TestStudentAge_StudentAgeInvalidCharacter() {
        String invalidAge = "abc";
        try {
            Integer.parseInt(invalidAge);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertTrue(true, "Caught expected NumberFormatException");

        }

//    @org.junit.jupiter.api.Test
//    void main() {
//    }
    }
}



