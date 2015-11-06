package chess;

import junit.framework.TestCase;
import util.StringUtil;

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
	private final String BLACK_ROW = StringUtil.newline("AAAAAAAA");// "PPPPPPPP";
	// p的大小写实在是太难分辨了，还是用第二个字母a来做区别好了
	private final String BLANK_ROW = StringUtil.newline("........");
	private final String WHITE_ROW = StringUtil.newline("aaaaaaaa");// "ppppPppp";

	@Override
	protected void setUp() throws Exception {
		board = new Board();
	}

	@Override
	protected void tearDown() throws Exception {
		Piece.countReset();
	}

	public void testCreate() throws Exception {
		assertEquals(0, board.getNumberOfPawns());
		board.initialize();
		assertEquals(32, Piece.count);
		assertEquals(16, Piece.blackCount);
		assertEquals(16, Piece.whiteCount);
		assertEquals(32, board.getNumberOfPawns());
		assertEquals(WHITE_ROW, StringUtil.newline(board.getRowPrint(1)));
		assertEquals(BLACK_ROW, StringUtil.newline(board.getRowPrint(6)));
	}

	public void testPrintBoard() throws Exception {
		StringBuilder boardPrint = new StringBuilder();
		board.initialize();// 最后居然是因为这里忘了做初始化操作
		boardPrint = board.print();
		// final String expectBoardPrint = getInitialChessBoardPrint();
		// assertEquals(expectBoardPrint, boardPrint.toString());
		assertEquals(
				StringUtil.newline("RNBKQBNR") + BLACK_ROW + BLANK_ROW
						+ BLANK_ROW + BLANK_ROW + BLANK_ROW + WHITE_ROW
						+ StringUtil.newline("rnbqkbnr"), boardPrint.toString());
	}

	// 只在单个方法内发挥作用的内容，不需要独立为一个函数
	// private String getInitialChessBoardPrint() {
	// StringBuilder chessBoard = new StringBuilder();
	// addRow(chessBoard, "RNBKQBNR");// 黑方棋子
	// addRow(chessBoard, BLACK_ROW);
	// for (int i = 0; i < 4; i++) {
	// addRow(chessBoard, BLANK_ROW);
	// }
	// addRow(chessBoard, WHITE_ROW);
	// addRow(chessBoard, "rnbqkbnr");// 白方棋子
	// return chessBoard.toString();
	// }

	// private void addRow(StringBuilder chessBoard, String row) {
	// chessBoard.append(StringUtil.newline(row));
	// }

	// public void testAddPawns() throws Exception {
	// Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE);
	// Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK);
	// board.addPawn(whitePawn, 1, 1);
	// assertEquals(1, board.getNumberOfPawns());
	// assertEquals(String.format("pawn list:%n%s%nend", "[white,1,1]"),
	// board.getPawnList());
	// // assertEquals(String.format("pawn list:%n%s%nend", "[white,1,1]"),
	// // board.getPawnList());
	// board.addPawn(blackPawn, 1, 2);
	// assertEquals(2, board.getNumberOfPawns());
	// assertEquals(String.format("pawn list:%n%s%n%s%nend", "[white,1,1]",
	// "[black,1,2]"), board.getPawnList());
	// // System.out.println(board.getPawnList());
	// }

}
