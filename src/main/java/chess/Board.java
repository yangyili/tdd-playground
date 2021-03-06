package chess;

import java.util.Arrays;

/**
 * Created by afaren on 7/30/17.
 */
public class Board {

    private Pawn[][] pawns;

    public Board() {
        pawns = new Pawn[8][8];
        initialize();
    }

    private void initialize() {

        for (int column = 0; column < 8; column++) {
            add(new Pawn(Pawn.WHITE), 1, column); /* 第 2 行 */
            add(new Pawn(Pawn.BLACK), 6, column); /* 第 7 行 */
        }
    }

    public int numberOfPawns() {
        int count = 0;
        for (Pawn[] row : pawns) {
            for (Pawn pawn : row) {
                if (pawn != null) {
                    count++;
                }
            }
        }
        return count;
    }

    public void add(Pawn pawn, int row, int column) {
        pawns[row][column] = pawn;
    }

    public boolean contains(Pawn pawn) {
        for (Pawn[] row : pawns) {
            for (Pawn item : row) {
                if (item.equals(pawn)) {
                    return true;
                }
            }
        }

        return false;
    }

    public Pawn getPawn(int row, int column) {
        return pawns[row][column];
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();

        Arrays.stream(pawns).forEach(row -> {
            Arrays.stream(row).forEach(pawn -> board.append(pawn == null ? '.' : pawn));
            board.append('\n');
        });

        return board.toString();
    }
}
