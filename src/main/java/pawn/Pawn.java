package pawn;

/**
 * Created by afaren on 4/6/17.
 */
public class Pawn {
    private String color;
    static final String WHITE = "White";
    static final String BLACK = "Black";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = WHITE;
    }

    public String getColor() {
        return color;
    }
}
