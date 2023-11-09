public class Board {

  private Box[][] board = new Box[3][3];

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
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j].getState().equals("X")
            && board[i][j + 1].getState().equals("X")
            && board[i][j + 2].getState().equals("X")) {
          return true;
        }
        if (board[i][j].getState().equals("Y")
            && board[i][j + 1].getState().equals("Y")
            && board[i][j + 2].getState().equals("Y")) {
          return true;
        }
        if (board[i][j].getState().equals("X")
            && board[i + 1][j].getState().equals("X")
            && board[i + 2][j].getState().equals("X")) {
          return true;
        }
        if (board[i][j].getState().equals("Y")
            && board[i + 1][j].getState().equals("Y")
            && board[i + 2][j].getState().equals("Y")) {
          return true;
        }
      }
    }
    return false;

  }
}
