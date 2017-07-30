package chess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by afaren on 7/30/17.
 */
public class Board {

    private List<Pawn> pawns;

    public Board() {
        pawns = new ArrayList<>();
    }

    public int numberOfPawns() {
        return pawns.size();

    }

    public void add(Pawn pawn) {
        pawns.add(pawn);
    }

    public boolean contains(Pawn pawn) {

        return pawns.contains(pawn);
    }
}
