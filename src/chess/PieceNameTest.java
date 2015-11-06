package chess;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author : Chen
 * @fileName : chess.PieceNameTest.java
 * 
 * @date: Nov 6, 2015 5:57:43 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class PieceNameTest extends TestCase {

	@Test
	public void testGetPrint() {
		PieceName pieceName = PieceName.BISHOP;
		assertEquals("b", pieceName.getPrint());
		pieceName = PieceName.KING;
		assertEquals("k", pieceName.getPrint());
		pieceName = PieceName.KNIGHT;
		assertEquals("n", pieceName.getPrint());
		assertEquals("N", pieceName.getPrint().toUpperCase());

	}

}
