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
    if (checkColumn().getWinner() == "X" || checkColumn().getWinner() == "Y") return true;
    if (checkRow().getWinner() == "X" || checkRow().getWinner() == "Y") return true;
    if (checkDiagonal().getWinner() == "X" || checkDiagonal().getWinner() == "Y") return true;
    return false;
  }

  private Winner checkColumn() {

    Winner winner = new Winner();

    for (int i = 0; i < board.length; i++) {
      if (board[i][0].getState().equals("X")
          && board[i][1].getState().equals("X")
          && board[i][2].getState().equals("X")) {
        winner.setWinner("X");
        return winner;
      }
      if (board[i][0].getState().equals("Y")
          && board[i][1].getState().equals("Y")
          && board[i][2].getState().equals("Y")) {
        winner.setWinner("Y");
        return winner;
      }
    }
    return winner;
  }

  private Winner checkRow() {

    Winner winner = new Winner();

    for (int i = 0; i < board.length; i++) {
      if (board[0][i].getState().equals("X")
          && board[1][i].getState().equals("X")
          && board[2][i].getState().equals("X")) {
        winner.setWinner("X");
        return winner;
      }
      if (board[0][i].getState().equals("Y")
          && board[1][i].getState().equals("Y")
          && board[2][i].getState().equals("Y")) {
        winner.setWinner("Y");
        return winner;
      }
    }
    return winner;
  }

  private Winner checkDiagonal() {

    Winner winner = new Winner();

    for (int i = 0; i < board.length; i++) {
      if (board[0][0].getState().equals("X")
          && board[1][1].getState().equals("X")
          && board[2][2].getState().equals("X")) {
        winner.setWinner("X");
        return winner;
      }
      if (board[0][2].getState().equals("Y")
          && board[1][1].getState().equals("Y")
          && board[2][0].getState().equals("Y")) {
        winner.setWinner("Y");
        return winner;
      }
      if (board[0][0].getState().equals("Y")
          && board[1][1].getState().equals("Y")
          && board[2][2].getState().equals("Y")) {
        winner.setWinner("X");
        return winner;
      }
      if (board[0][2].getState().equals("X")
          && board[1][1].getState().equals("X")
          && board[2][0].getState().equals("X")) {
        winner.setWinner("Y");
        return winner;
      }
    }
    return winner;
  }
}
