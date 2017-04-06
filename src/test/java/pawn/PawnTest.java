package pawn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by afaren on 4/6/17.
 */
public class PawnTest {
    @Test
    public void test_create() throws Exception {
        final String WHITE = "White";
        Pawn whitePawn = new Pawn(WHITE);
        assertEquals(WHITE, whitePawn.getColor());

        final String BLACK = "Black";
        Pawn blackPawn = new Pawn(BLACK);
        assertEquals(BLACK, blackPawn.getColor());
    }
}
