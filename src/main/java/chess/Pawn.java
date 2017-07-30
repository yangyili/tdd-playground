package chess;

/**
 * Created by afaren on 4/6/17.
 */
public class Pawn {
    private String representation;
    private String color;
    static final String WHITE = "White";
    static final String BLACK = "Black";

    static final String WHITE_REPRESENTATION = "W";
    static final String BLACK_REPRESENTATION = "B";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = WHITE;
    }

    public Pawn(String color, String representation) {
        this.color = color;
        this.representation = representation;
    }

    public String getColor() {
        return color;
    }

    public String representation() {
        return representation;
    }
}
