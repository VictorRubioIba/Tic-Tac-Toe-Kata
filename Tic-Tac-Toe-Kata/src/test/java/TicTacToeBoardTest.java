import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TicTacToeBoardTest {

  @Test
  public void shouldReturnEmptyIfBoxIsEmpty() {

    Board board = new Board();

    board.setStatusBoxInBoard(1, 1, "");

    assertThat(board.getStatusBoxInBoard(1, 1)).isEqualTo("");
  }

  @Test
  public void shouldReturnXIfBoxIsX() {

    Board board = new Board();

    board.setStatusBoxInBoard(1, 1, "X");

    assertThat(board.getStatusBoxInBoard(1, 1)).isEqualTo("X");
  }

  @Test
  public void shouldReturnYIfBoxIsY() {

    Board board = new Board();

    board.setStatusBoxInBoard(1, 1, "Y");

    assertThat(board.getStatusBoxInBoard(1, 1)).isEqualTo("Y");
  }

  @Test
  public void shouldReturnEmptyIfBoxIsNotXOrY() {

    Board board = new Board();

    board.setStatusBoxInBoard(1, 1, "n");

    assertThat(board.getStatusBoxInBoard(1, 1)).isEqualTo("");
  }

  @Test
  public void shouldReturnTrueIfWinOnColumn() {
    Board board = new Board();

    board.setStatusBoxInBoard(0, 0, "X");
    board.setStatusBoxInBoard(0, 1, "X");
    board.setStatusBoxInBoard(0, 2, "X");

    assertThat(board.checkWinner()).isTrue();
  }
}
