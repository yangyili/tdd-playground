package student;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSessionTest {
    @Test
    public void test_create() throws Exception {
        CourseSession english = new CourseSession("ENGLISH", "101");
        assertEquals("ENGLISH", english.getDepartment());
        assertEquals("101", english.getNumber());

        assertEquals(0, english.getNumberOfStudents());
    }


    @Test
    public void test_enroll_students() throws Exception {
        CourseSession english = new CourseSession("ENGLISH", "101");

        assertEquals(0, english.getNumberOfStudents());

        Student student_1 = new Student("student_1");
        english.enroll(student_1);
        assertEquals(1, english.getNumberOfStudents());

        List allStudents = english.getAllStudents();
        assertEquals(1, allStudents.size());
        assertEquals(student_1, allStudents.get(0));


        Student student_2 = new Student("student_2");
        english.enroll(student_2);
        assertEquals(2, english.getNumberOfStudents());

        assertEquals(2, allStudents.size());
        assertEquals(student_2, allStudents.get(1));

    }
}

