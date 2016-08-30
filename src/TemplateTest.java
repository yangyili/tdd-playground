/**
 * Created by afaren on 8/29/16.
 */

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.fail;
import static org.testng.Assert.assertEquals;

public class TemplateTest {
    private Template template;

    @BeforeTest
    public void setUp() throws Exception {
        template = new Template("${one}, ${two}, ${three}");
        template.set("one", "1");
        template.set("two", "2");
        template.set("three", "3");
    }

    @Test
    public void unknown_variables_are_ignored() throws Exception {
        template.set("doesnotexsit", "whatever");
        assert_template_evaluate_to("1, 2, 3");
    }

    @Test
    public void multiply_variables() throws Exception {
        assert_template_evaluate_to("1, 2, 3");
    }

    @Test
    public void missing_value_raise_exception() throws Exception {
        try {
            new Template("${foo}").evaluate();
            fail("evaluate() should throw an exception if a variable was left without a value");
        } catch (MissingValueException expected) {
            assertEquals("No value for ${foo}", expected.getMessage());
        }

    }

    private void assert_template_evaluate_to(String expected) {
        assertEquals(expected, template.evaluate());
    }

}