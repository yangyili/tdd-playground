package chess;

import org.junit.Test;

import static chess.Pawn.*;
import static org.junit.Assert.assertEquals;


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

    @Test
    public void test_print_representation() throws Exception {
        Pawn black = new Pawn(BLACK, BLACK_REPRESENTATION);
        Pawn white = new Pawn(WHITE, WHITE_REPRESENTATION);
        assertEquals(black.representation(), BLACK_REPRESENTATION);
        assertEquals(white.representation(), WHITE_REPRESENTATION);

    }
}
