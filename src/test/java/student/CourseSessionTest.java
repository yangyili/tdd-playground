package student;

import org.junit.Test;

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
}
