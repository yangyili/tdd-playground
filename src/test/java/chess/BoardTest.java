package chess;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by afaren on 7/30/17.
 */
public class BoardTest {
    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board();
    }

    @Test
    public void test_initialization() throws Exception {
        assertEquals(16, board.numberOfPawns());
        assertRow(1, "WWWWWWWW");
        assertRow(6, "BBBBBBBB");
        assertEquals( "........\n"
                    + "WWWWWWWW\n"
                    + "........\n"
                    + "........\n"
                    + "........\n"
                    + "........\n"
                    + "BBBBBBBB\n"
                    + "........\n",
                board.toString());
    }

    private void assertRow(int row, String expected) {
        Pawn[] pawns = new Pawn[8];
        for (int i = 0; i < 8; i++) {
            pawns[i] = board.getPawn(row, i);
        }
        String actual = Arrays.stream(pawns).map(Pawn::toString).collect(Collectors.joining());
        assertEquals(expected, actual);
    }
}