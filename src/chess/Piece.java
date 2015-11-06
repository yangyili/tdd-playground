package chess;

/**
 * @author : Chen
 * @fileName : chess.Piece.java
 * 
 * @date: Nov 6, 2015 2:01:25 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class Piece {
	PieceColor color;
	PieceName name;
	public static int count = 0;
	public static int whiteCount;
	public static int blackCount;

	public static void countReset() {
		count = 0;
		whiteCount = 0;
		blackCount = 0;
	}

	public static Piece createPiece(PieceColor color, PieceName name) {
		return new Piece(color, name);
	}

	private Piece(PieceColor color, PieceName name) {
		this.color = color;
		this.name = name;
		count++;// 记录piece数量
		if (color == PieceColor.WHITE) {
			whiteCount++;
		} else {
			blackCount++;
		}
	}

	public PieceColor getColor() {
		return color;
	}

	public PieceName getName() {
		return name;
	}

	public String getPrint() {
		String print = name.getPrint();
		return color == PieceColor.WHITE ? print : print.toUpperCase();
	}

	public boolean isWhite() {
		return color == PieceColor.WHITE ? true : false;
	}

	public boolean isBlack() {
		return !isWhite();
	}

}
