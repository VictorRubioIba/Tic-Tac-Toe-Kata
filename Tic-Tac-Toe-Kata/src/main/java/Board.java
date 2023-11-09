import org.example.Position;

public class Board {

  private Box[][] board = new Box[3][3];

  public Board() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = new Box();
      }
    }
  }

  public String getStatusBoxInBoard(Position position) {
    return board[position.positionX()][position.positionY()].getState();
  }

  public void setStatusBoxInBoard(Position position, String state) {
    this.board[position.getPositionX()][position.getPositionY()].setState(state);
  }

  public boolean checkWinner() {
    return checkColumn() || checkRow() || checkDiagonal();
  }

  private boolean checkColumn() {
    for (int i = 0; i < board.length; i++) {
      if (board[i][0].getState().equals("X")
          && board[i][1].getState().equals("X")
          && board[i][2].getState().equals("X")) {
        return true;
      }
      if (board[i][0].getState().equals("Y")
          && board[i][1].getState().equals("Y")
          && board[i][2].getState().equals("Y")) {
        return true;
      }
    }
    return false;
  }

  private boolean checkRow() {
    for (int i = 0; i < board.length; i++) {
      if (board[0][i].getState().equals("X")
          && board[1][i].getState().equals("X")
          && board[2][i].getState().equals("X")) {
        return true;
      }
      if (board[0][i].getState().equals("Y")
          && board[1][i].getState().equals("Y")
          && board[2][i].getState().equals("Y")) {
        return true;
      }
    }
    return false;
  }

  private boolean checkDiagonal() {
    for (int i = 0; i < board.length; i++) {
      if (board[0][0].getState().equals("X")
          && board[1][1].getState().equals("X")
          && board[2][2].getState().equals("X")) {
        return true;
      }
      if (board[0][2].getState().equals("Y")
          && board[1][1].getState().equals("Y")
          && board[2][0].getState().equals("Y")) {
        return true;
      }
      if (board[0][0].getState().equals("Y")
          && board[1][1].getState().equals("Y")
          && board[2][2].getState().equals("Y")) {
        return true;
      }
      if (board[0][2].getState().equals("X")
          && board[1][1].getState().equals("X")
          && board[2][0].getState().equals("X")) {
        return true;
      }
    }
    return false;
  }
}
