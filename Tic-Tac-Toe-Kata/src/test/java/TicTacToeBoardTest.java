import static org.assertj.core.api.Assertions.assertThat;

import org.example.Position;
import org.testng.annotations.Test;

public class TicTacToeBoardTest {

  @Test
  public void shouldReturnEmptyIfBoxIsEmpty() {

    Board board = new Board();

    board.setStatusBoxInBoard(new Position(1, 1), " ");

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(" ");
  }

  @Test
  public void shouldReturnXIfBoxIsX() {

    Board board = new Board();

    board.setStatusBoxInBoard(new Position(1, 1), "X");

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo("X");
  }

  @Test
  public void shouldReturnYIfBoxIsY() {

    Board board = new Board();

    board.setStatusBoxInBoard(new Position(1, 1), "Y");

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo("Y");
  }

  @Test
  public void shouldReturnEmptyIfBoxIsNotXOrY() {

    Board board = new Board();

    board.setStatusBoxInBoard(new Position(1, 1), "n");

    assertThat(board.getStatusBoxInBoard(new Position(1, 1))).isEqualTo(" ");
  }

  @Test
  public void shouldReturnTrueIfWinOnColumn() {
    Board board = new Board();

    board.setStatusBoxInBoard(new Position(0, 0), "X");
    board.setStatusBoxInBoard(new Position(0, 1), "X");
    board.setStatusBoxInBoard(new Position(0, 2), "X");

    assertThat(board.checkWinner()).isTrue();
  }

  @Test
  public void shouldReturnTrueIfWinOnRow() {
    Board board = new Board();

    board.setStatusBoxInBoard(new Position(0, 0), "Y");
    board.setStatusBoxInBoard(new Position(1, 0), "Y");
    board.setStatusBoxInBoard(new Position(2, 0), "Y");

    assertThat(board.checkWinner()).isTrue();
  }
  @Test
  public void shouldReturnTrueIfWinOnDiagonal() {
    Board board = new Board();

    board.setStatusBoxInBoard(new Position(0, 0), "Y");
    board.setStatusBoxInBoard(new Position(1, 1), "Y");
    board.setStatusBoxInBoard(new Position(2, 2), "Y");

    assertThat(board.checkWinner()).isTrue();
  }
}
