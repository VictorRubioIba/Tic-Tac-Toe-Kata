import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TicTacToeBoardTest {

  @Test
  public void shouldReturnEmptyIfBoxIsEmpty() {

    Board board = new Board();

    board.play(new Position(1, 1), Player.EMPTY);

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(Player.EMPTY);
  }

  @Test
  public void shouldReturnXIfBoxIsX() {

    Board board = new Board();

    board.play(new Position(1, 1), Player.X);

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(Player.X);
  }

  @Test
  public void shouldReturnYIfBoxIsY() {

    Board board = new Board();

    board.play(new Position(1, 1), Player.O);

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(Player.O);
  }

  @Test
  public void shouldReturnEmptyIfBoxIsNotXOrY() {

    Board board = new Board();

    board.play(new Position(1, 1), Player.EMPTY);

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(Player.EMPTY);
  }

  @Test
  public void shouldReturnTrueIfWinOnColumn() {
    Board board = new Board();

    board.play(new Position(0, 0), Player.X);
    board.play(new Position(0, 1), Player.X);
    board.play(new Position(0, 2), Player.X);

    assertThat(board.getWinner()).isEqualTo(Player.X);
  }

  @Test
  public void shouldReturnTrueIfWinOnRow() {
    Board board = new Board();

    board.play(new Position(0, 0), Player.O);
    board.play(new Position(1, 0), Player.O);
    board.play(new Position(2, 0), Player.O);

    assertThat(board.getWinner()).isEqualTo(Player.O);
  }
  @Test
  public void shouldReturnTrueIfWinOnDiagonal() {
    Board board = new Board();

    board.play(new Position(0, 0), Player.O);
    board.play(new Position(1, 1), Player.O);
    board.play(new Position(2, 2), Player.O);

    assertThat(board.getWinner()).isEqualTo(Player.O);
  }
}
