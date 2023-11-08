import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.BeforeClass;
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
  public void shouldReturnTrueIfWin() {
    Board board = new Board();

    assertThat(board.checkWinner()).isTrue();
  }
}
