package pawn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by afaren on 7/30/17.
 */
public class BoardTest {
    @Test
    public void test_create() throws Exception {
        assertEquals(0, new Board().numberOfPawns());
    }
}