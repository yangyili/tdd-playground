package chess;

import org.junit.Before;
import org.junit.Test;

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
    public void test_create() throws Exception {
        assertEquals(0, board.numberOfPawns());
    }

    @Test
    public void test_add_pawn_into_board() throws Exception {
        assertEquals(0, board.numberOfPawns());

        Pawn pawn_1 = new Pawn(Pawn.WHITE);
        board.add(pawn_1);
        assertEquals(1, board.numberOfPawns());
        assertTrue(board.contains(pawn_1));

        Pawn pawn_2 = new Pawn(Pawn.BLACK);
        board.add(pawn_2);
        assertEquals(2, board.numberOfPawns());
        assertTrue(board.contains(pawn_2));
    }


}