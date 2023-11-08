public class Board {

	private Box [][] board = new Box[3][3];

	public Board() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = new Box();
			}
		}
	}
	public String getStatusBoxInBoard(int positionX, int positionY) {
		return board[positionX][positionY].getState();
	}


	public void setStatusBoxInBoard(int positionX, int positionY, String state) {
		this.board[positionX][positionY].setState(state);
	}


	public boolean checkWinner() {
		return true;
	}
}
