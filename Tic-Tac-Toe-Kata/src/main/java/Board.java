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
		return checkColumnWinner();
	}

	public boolean checkColumnWinner() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[0][0].getState().equals("X") && board[0][1].getState().equals("X") && board[0][2].getState().equals("X")) {
					return true;
				}
				if(board[1][0].getState().equals("Y") && board[1][1].getState().equals("Y") && board[1][2].getState().equals("Y")) {
					return true;
				}
				if(board[2][0].getState().equals("Y") && board[2][1].getState().equals("Y") && board[2][2].getState().equals("Y")) {
					return true;
				}
			}
		}
		return false;
	}
}
