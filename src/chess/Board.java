package chess;

import static util.StringUtil.newline;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import util.StringUtil;

/**
 * @author : Chen
 * @fileName : .Board.java
 * 
 * @date: Nov 5, 2015 3:06:42 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class Board {

	private int numberOfPawns;

	// Pawn[][] chessBoard = new Pawn[8][8];// 用矩阵存储棋盘
	Piece[][] chessBoard = new Piece[8][8];

	public Board() {
		// initialize();// 增加两行卒
		// numberOfPawns = 16;
	}

	public void addPiece(Piece piece, int row, int col) {
		numberOfPawns++;
		setPiece(piece, row, col);
	}

	public int getNumberOfPawns() {
		return numberOfPawns;
	}

	public String getPawnList() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(newline("pawn list:"));
		int count = 0;// 统计pawn数量
		for (int i = 0; i < chessBoard.length; i++)
			for (int j = 0; j < chessBoard[i].length; j++) {
				if (chessBoard[i][j] != null) {
					final String position = "[" + chessBoard[i][j].getColor()
							+ "," + i + "," + j + "]";
					sBuilder.append(newline(position));
					if (++count == numberOfPawns) {
						j = chessBoard[i].length - 1;
						i = chessBoard.length - 1;
					}
				}
			}
		sBuilder.append("end");
		return sBuilder.toString();

	}

	public String getRowPrint(int rowIndex) {
		List<Piece> row = getRow(rowIndex);
		Assert.assertEquals("a row should contain 8 pieces", 8, row.size());
		StringBuilder rowPrint = new StringBuilder();
		for (Piece piece : row) {
			// Assert.assertNotNull("piece must not be null", piece);
			rowPrint.append(piece == null ? "." : piece.getPrint());
		}
		// System.out.println(rowPrint.toString());
		return rowPrint.toString();
	}

	void initialize() {
		// final int firstRow = 0;
		final int secondRow = 1;
		final int sixthRow = 6;

		for (int i = 0; i < 8; i++) {
			// setPawn(new Pawn(Pawn.COLOR_WHITE), secondRow, i);
			// setPawn(new Pawn(Pawn.COLOR_BLACK), sixthRow, i);
			addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.PAWN),
					sixthRow, i);
			addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.PAWN),
					secondRow, i);
		}

		// numberOfPawns = 16;

		// 设置另外两列
		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.ROOK), 0, 0);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.ROOK), 7, 7);
		// numberOfPawns = 18;WHITE;

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.KNIGHT), 0, 1);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.KNIGHT), 7, 6);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.BISHOP), 0, 2);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.BISHOP), 7, 5);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.QUEEN), 0, 3);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.QUEEN), 7, 4);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.KING), 0, 4);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.KING), 7, 3);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.BISHOP), 0, 5);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.BISHOP), 7, 2);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.KNIGHT), 0, 6);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.KNIGHT), 7, 1);

		addPiece(Piece.createPiece(PieceColor.WHITE, PieceName.ROOK), 0, 7);
		addPiece(Piece.createPiece(PieceColor.BLACK, PieceName.ROOK), 7, 0);

		// numberOfPawns = 32;
	}

	public StringBuilder print() {
		StringBuilder print = new StringBuilder();
		for (int i = 7; i >= 0; i--) {
			print.append(StringUtil.newline(getRowPrint(i)));
		}
		return print;
	}

	private List<Piece> getRow(int rowIndex) {
		List<Piece> row = new ArrayList<Piece>();
		for (Piece piece : chessBoard[rowIndex]) {
			row.add(piece);
		}
		return row;
	}

	private void setPiece(Piece piece, int row, int col) {
		chessBoard[row][col] = piece;
	}
}
