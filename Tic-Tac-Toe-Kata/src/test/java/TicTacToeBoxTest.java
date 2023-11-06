import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import org.assertj.core.api.Assertions;

public class TicTacToeBoxTest {

	@Test
	public void shouldReturnEmptyIfNotTicTacToe (){
		Box box = new Box();

		String result = box.getState("");

		assertThat(Box.getState("")).isEqualTo(result);

	}

	@Test
	public void shouldReturnXIfTicTacToeIsX (){
		Box box = new Box();

		String result = box.getState("X");

		assertThat(Box.getState("X")).isEqualTo(result);

	}

}


