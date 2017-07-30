package chess;

/**
 * Created by afaren on 4/6/17.
 */
public class Pawn {
    private String color;
    static final String WHITE = "White";
    static final String BLACK = "Black";

    public enum Representation {
        WHITE("W"), BLACK("B");

        private String representation;

        @Override
        public String toString() {
            return representation;
        }

        Representation(String representation) {
            this.representation = representation;
        }
    }

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = WHITE;
    }

    public String getColor() {
        return color;
    }

    public Representation representation() {
        return color.equals(WHITE) ? Representation.WHITE : Representation.BLACK;
    }

    @Override
    public String toString() {
        return representation().toString();
    }
}
