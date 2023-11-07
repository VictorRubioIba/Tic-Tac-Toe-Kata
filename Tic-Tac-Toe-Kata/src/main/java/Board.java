public class Board {
	private int positionX;
	private int positionY;
	private Box [][] board = new Box[3][3];

	public Board() {
	}
	public String getStatusBoxInBoard(int positionX, int positionY) {
		return board[positionX][positionY].getState("");
	}


}
