package chess;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static chess.Pawn.BLACK;
import static chess.Pawn.WHITE;


/**
 * Created by afaren on 4/6/17.
 */
public class PawnTest {
    @Test
    public void test_create() throws Exception {
        Pawn whitePawn = new Pawn(WHITE);
        assertEquals(WHITE, whitePawn.getColor());

        Pawn blackPawn = new Pawn(BLACK);
        assertEquals(BLACK, blackPawn.getColor());
    }

    @Test
    public void test_create_default_color_pawn() throws Exception {
        Pawn pawn = new Pawn();
        assertEquals(WHITE, pawn.getColor());
    }
}
