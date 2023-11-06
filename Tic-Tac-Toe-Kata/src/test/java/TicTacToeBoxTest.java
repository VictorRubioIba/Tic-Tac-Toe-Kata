import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import org.assertj.core.api.Assertions;

public class TicTacToeBoxTest {

	@Test
	public void shouldReturnEmptyIfNotTicTacToe (){
		Box box = new Box();

		String result = box.getState("");

		assertThat(box.getState("")).isEqualTo(result);

	}

	@Test
	public void shouldReturnXIfTicTacToeIsX (){
		Box box = new Box();

		String result = box.getState("X");

		assertThat(box.getState("X")).isEqualTo(result);

	}

	@Test
	public void shouldReturnYIfTicTacToeIsY (){
		Box box = new Box();

		String result = box.getState("Y");

		assertThat(box.getState("Y")).isEqualTo(result);

	}

	@Test

	public void shouldReturnEmptyIfTicTacToeIsDifferentXY (){
		Box box = new Box();

		String result = box.getState("x");

		assertThat(box.getState("")).isEqualTo(result);

	}

}


