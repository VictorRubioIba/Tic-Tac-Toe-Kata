public class Board {

  private Player[][] board = new Player[3][3];

  public Board() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = Player.EMPTY;
      }
    }
  }

  public Player playerPosition(Position position) {
    return board[position.positionX()][position.positionY()];
  }

  public void play(Position position, Player player) {
    this.board[position.getPositionX()][position.getPositionY()] = player;
  }

  public Player getWinner() {;

	  if (checkColumn() != Player.EMPTY){return checkColumn();}
      if (checkRow() != Player.EMPTY){return checkRow();}
      if (checkDiagonal() != Player.EMPTY){return checkDiagonal();}
	  return Player.EMPTY;
  }

  private Player checkColumn() {

    for (int i = 0; i < board.length; i++) {
      if (board[i][0].equals(Player.X) && board[i][1].equals(Player.X) && board[i][2].equals(Player.X)) {
        return Player.X;
      }
      if (board[i][0].equals(Player.O) && board[i][1].equals(Player.O) && board[i][2].equals(Player.O)) {
        return Player.O;
      }
    }
    return Player.EMPTY;
  }

  private Player checkRow() {

    for (int i = 0; i < board.length; i++) {
      if (board[0][i].equals(Player.X) && board[1][i].equals(Player.X) && board[2][i].equals(Player.X)) {
        return Player.X;
      }
      if (board[0][i].equals(Player.O) && board[1][i].equals(Player.O) && board[2][i].equals(Player.O)) {
        return Player.O;
      }
    }
    return Player.EMPTY;
  }

  private Player checkDiagonal() {

    for (int i = 0; i < board.length; i++) {
      if (board[0][0].equals(Player.X) && board[1][1].equals(Player.X) && board[2][2].equals(Player.X)) {
        return Player.X;
      }
      if (board[0][2].equals(Player.O) && board[1][1].equals(Player.O) && board[2][0].equals(Player.O)) {
        return Player.O;
      }
      if (board[0][0].equals(Player.O) && board[1][1].equals(Player.O) && board[2][2].equals(Player.O)) {
        return Player.O;
      }
      if (board[0][2].equals(Player.X) && board[1][1].equals(Player.X) && board[2][0].equals(Player.X)) {
        return Player.X;
      }
    }
    return Player.EMPTY;
  }
}
