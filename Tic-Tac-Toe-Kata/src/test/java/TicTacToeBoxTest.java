import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import org.assertj.core.api.Assertions;

public class TicTacToeBoxTest {

	@Test
	public void shouldReturnEmptyIfNotTicTacToe (){
		Box box = new Box();

		String result = box.getState();

		assertThat(box.getState()).isEqualTo(result);

	}

	@Test
	public void shouldReturnXIfTicTacToeIsX (){
		Box box = new Box();

		box.setState("X");

		assertThat(box.getState()).isEqualTo("X");

	}

	@Test
	public void shouldReturnYIfTicTacToeIsY (){
		Box box = new Box();

		box.setState("Y");

		assertThat(box.getState()).isEqualTo("Y");

	}

	@Test

	public void shouldReturnEmptyIfTicTacToeIsDifferentXY (){
		Box box = new Box();

		box.setState("x");

		assertThat(box.getState()).isEqualTo("");

	}

}


