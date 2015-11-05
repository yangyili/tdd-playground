/**
 * @author : Chen
 * @fileName : .Pawn.java
 * 
 * @date: Nov 5, 2015 2:07:53 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class Pawn {

	public static final String COLOR_BLACK = "black";
	public static final String COLOR_WHITE = "white";
	private String color;

	public Pawn(String color) {
		this.color = color;
	}

	public Pawn() {
		final String defaultColor = Pawn.COLOR_WHITE;
		this.color = defaultColor;
	}

	public String getColor() {
		return color == null ? "white" : color;
	}

}
