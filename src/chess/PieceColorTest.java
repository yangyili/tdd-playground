package chess;

import junit.framework.TestCase;

/**
 * @author : Chen
 * @fileName : chess.PieceColorTest.java
 * 
 * @date: Nov 6, 2015 6:03:57 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class PieceColorTest extends TestCase {
	Piece piece;

	@Override
	protected void setUp() throws Exception {
		piece = Piece.createPiece(PieceColor.BLACK, PieceName.BISHOP);
	}

	@Override
	protected void tearDown() throws Exception {
		Piece.countReset();
	}

	public void testColorChange() throws Exception {

		assertEquals(PieceColor.BLACK, piece.getColor());
		assertEquals("B", piece.getColor() == PieceColor.BLACK ? piece
				.getPrint().toUpperCase() : piece.getPrint());
	}
}
