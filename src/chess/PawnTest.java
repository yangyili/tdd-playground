package chess;

import junit.framework.TestCase;

/**
 * @author : Chen
 * @fileName : .PawnTest.java
 * 
 * @date: Nov 5, 2015 2:08:07 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class PawnTest extends TestCase {
	Pawn pawn1;
	Pawn pawn2;

	@Override
	protected void setUp() throws Exception {
		pawn1 = new Pawn(Pawn.COLOR_BLACK);
		pawn2 = new Pawn(Pawn.COLOR_WHITE);
	}

	public void testCreate() throws Exception {
		assertEquals(Pawn.COLOR_BLACK, pawn1.getColor());
		assertEquals(Pawn.COLOR_WHITE, pawn2.getColor());
	}

	public void testDefaultColorPawn() throws Exception {
		Pawn pawn = new Pawn();
		assertEquals(Pawn.COLOR_WHITE, pawn.getColor());
	}

	public void testPresentation() throws Exception {
		assertEquals("p", pawn2.presentation());
		assertEquals("P", pawn1.presentation());
	}
}
