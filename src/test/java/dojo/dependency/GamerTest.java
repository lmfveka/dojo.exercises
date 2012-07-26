package dojo.dependency;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class GamerTest {

	@Test
	 public void runPlay(){
		//Given
		Gamer game = new Gamer();
		ByteArrayInputStream inputStream = new ByteArrayInputStream("1,5".getBytes());
		System.setIn(inputStream);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream, true));
		//when
		game.play();
		//then
		assertEquals("fizz buzz: " + System.getProperty("line.separator") + "1 2 Fizz 4 Buzz ",outputStream.toString());
	}
}
