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

	private int numberOfPawns = 0;

	// private Map<Pawn, Position> boardList = new HashMap<Pawn, Position>();

	Pawn[][] pawnList = new Pawn[8][8];

	public int getPawns() {
		return 0;
	}

	public void addPawn(Pawn pawn) {
		numberOfPawns++;
	}

	public int getNumberOfPawns() {
		return numberOfPawns;
	}

	public void addPawn(Pawn pawn, int row, int col) {
		numberOfPawns++;
		pawnList[row][col] = pawn;
	}

	public String getPawnList() {

		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(String.format("%s%n", "pawn list:"));
		int count = 0;// 统计pawn数量
		for (int i = 0; i < pawnList.length; i++)
			for (int j = 0; j < pawnList[i].length; j++) {
				if (pawnList[i][j] != null) {
					final String position = "[" + pawnList[i][j].getColor()
							+ "," + i + "," + j + "]";
					sBuilder.append(String.format("%s%n", position));
					if (++count == numberOfPawns) {
						j = pawnList[i].length - 1;
						i = pawnList.length - 1;
						System.out.println("sign count");
					}
				}

				System.out.println("count");
			}
		sBuilder.append("end");
		return sBuilder.toString();

	}
}
