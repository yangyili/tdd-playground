package chess;

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
            pawns[1][column] = new Pawn(Pawn.WHITE, Pawn.Representation.WHITE); /* 第 2 行 */
            pawns[6][column] = new Pawn(Pawn.BLACK, Pawn.Representation.BLACK); /* 第 7 行 */

        }
    }

    public int numberOfPawns() {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pawns[i][j] != null) {
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
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pawns[i][j].equals(pawn)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Pawn getPawn(int row, int column) {
        return pawns[row][column];
    }
}
