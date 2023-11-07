import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TicTacToeBoardTest {
  @Test
  public void shouldReturnEmptyIfBoxIsEmpty() {

    Board board = new Board();

    String result = board.getStatusBoxInBoard(1, 1);

    assertThat("").isEqualTo(result);
  }
}
