package chess;

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

    @Test
    public void test_add_pawn_into_board() throws Exception {
        Board board = new Board();
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