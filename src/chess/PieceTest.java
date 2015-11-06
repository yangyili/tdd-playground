package chess;

import junit.framework.TestCase;

/**
 * @author : Chen
 * @fileName : chess.PieceTest.java
 * 
 * @date: Nov 6, 2015 2:14:50 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class PieceTest extends TestCase {
	Piece piece;
	Piece piece2;

	@Override
	protected void setUp() throws Exception {
		piece = Piece.createPiece(PieceColor.WHITE, PieceName.KING);
		piece2 = Piece.createPiece(PieceColor.BLACK, PieceName.KING);
	}

	@Override
	protected void tearDown() throws Exception {
		Piece.countReset();
	}

	public void testCount() throws Exception {

		assertEquals(1, Piece.whiteCount);
		assertEquals(1, Piece.blackCount);
		assertEquals(2, Piece.count);
	}

	public void testCreate() throws Exception {
		assertEquals(2, Piece.count);
		assertEquals(PieceColor.WHITE, piece.getColor());
		assertEquals(PieceName.KING, piece.getName());
		assertEquals("k", piece.getPrint());

		assertEquals(PieceColor.BLACK, piece2.getColor());
		assertEquals(PieceName.KING, piece2.getName());
		assertEquals("K", piece2.getPrint());

	}

	public void testColorDefinite() throws Exception {

		assertEquals(2, Piece.count);
		assertTrue(piece.isWhite());
		assertTrue("is black", piece2.isBlack());
	}
}
