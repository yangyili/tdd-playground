package chess;

/**
 * @author : Chen
 * @fileName : chess.PieceName.java
 * 
 * @date: Nov 6, 2015 2:11:18 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public enum PieceName {
	// PAWN(1), KING(2), QUEEN(3), ROOK(4), BISHOP(5), KNIGHT(6);
	// private int i;
	//
	// PieceName(int i) {
	// this.i = i;
	// }
	PAWN("a"), KING("k"), QUEEN("q"), ROOK("r"), BISHOP("b"), KNIGHT("n");
	private String print;

	PieceName(String print) {
		this.print = print;
	}

	public String getPrint() {
		return print;
	}

}
