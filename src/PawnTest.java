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

	public void testCreate() throws Exception {
		Pawn pawn1 = new Pawn(Pawn.COLOR_BLACK);
		assertEquals(Pawn.COLOR_BLACK, pawn1.getColor());

		Pawn pawn2 = new Pawn(Pawn.COLOR_WHITE);
		assertEquals(Pawn.COLOR_WHITE, pawn2.getColor());
	}

	public void testDefaultColorPawn() throws Exception {
		Pawn pawn = new Pawn();
		assertEquals(Pawn.COLOR_WHITE, pawn.getColor());
	}

}
