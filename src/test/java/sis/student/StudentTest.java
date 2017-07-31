package sis.student;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by afaren on 3/24/17.
 */
public class StudentTest {
    @Test
    public void test_create() throws Exception {
        final String firstStudentName = "Afaren Chen";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        final String secondStudentName = "Jeff Chen";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, student.getName());

    }

    @Test
    public void test_student_status() throws Exception {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse("No enough credits for full time status", student.isFullTime());

        student.addCredits(12);
        assertEquals(Student.CREDITS_REQUEST_FOR_FULL_TIME, student.getCredits());
        assertTrue("12 is the minume credits for full time status", student.isFullTime());
    }

    @Test
    public void test_in_state() throws Exception {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());

    }
}