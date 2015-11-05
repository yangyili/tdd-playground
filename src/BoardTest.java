import junit.framework.TestCase;

/**
 * @author : Chen
 * @fileName : .BoardTest.java
 * 
 * @date: Nov 5, 2015 3:06:51 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class BoardTest extends TestCase {

	private Board board;

	@Override
	protected void setUp() throws Exception {
		board = new Board();
	}

	public void testCreate() throws Exception {
		assertEquals(0, board.getNumberOfPawns());
	}

	public void testAddPawns() throws Exception {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE);
		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK);
		board.addPawn(whitePawn, 1, 1);
		assertEquals(1, board.getNumberOfPawns());

		assertEquals(String.format("pawn list:%n%s%nend", "[white,1,1]"),
				board.getPawnList());

		board.addPawn(blackPawn, 1, 2);
		assertEquals(2, board.getNumberOfPawns());

		assertEquals(String.format("pawn list:%n%s%n%s%nend", "[white,1,1]",
				"[black,1,2]"), board.getPawnList());

		System.out.println(board.getPawnList());
	}

	public void testPawnList() throws Exception {
		final Pawn pawn = new Pawn();
		board.pawnList[1][1] = pawn;
		assertEquals(pawn, board.pawnList[1][1]);
		assertNull(board.pawnList[1][2]);
		assertNull(board.pawnList[1][3]);
	}

}
