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

        Pawn[] secondRow = new Pawn[8];
        for (int i = 0; i < 8; i++) {
            secondRow[i] = board.getPawn(1, i);
        }

        String second = Arrays.stream(secondRow).map(Pawn::toString).collect(Collectors.joining());
        assertEquals("WWWWWWWW", second);

        Pawn[] seventhRow = new Pawn[8];
        for (int i = 0; i < 8; i++) {
            seventhRow[i] = board.getPawn(6, i);
        }
        String seven = Arrays.stream(seventhRow).map(Pawn::toString).collect(Collectors.joining());
        assertEquals("BBBBBBBB", seven );

    }
}