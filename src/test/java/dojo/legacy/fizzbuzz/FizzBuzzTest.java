package dojo.legacy.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzTest {  // MAIL THIS TO LMFVEKA :)
	
  @Test
  public void shouldThrowExceptionWhenStartIsBelowZero() {
	  try {
		  new FizzBuzz().play(-1, -1);
		  fail(" FAILED: expected IllegalArgumentException-exception when play(-1, -1)");
	} catch (IllegalArgumentException e) {
		assertEquals(0,0);
	}
    catch (Exception e) {
		  fail(" FAILED: expected IllegalArgumentException-exception");
	}
  }
  @Test
  public void shouldThrowExceptionWhenStartIsBiggerThanStop() {
	  try {
		  new FizzBuzz().play(2, 0);
		  fail(" FAILED: expected IllegalArgumentException-exception when play(2, 0)");
	} catch (IllegalArgumentException e) {
		assertEquals(0,0);
	}
    catch (Exception e) {
		  fail(" FAILED: expected IllegalArgumentException-exception");
	}
  }
  @Test
  public void shouldReturnArray_2_Fizz() {
	  String[] array = new FizzBuzz().play(1, 15);
System.out.println(Arrays.asList(array));
	  assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, array);
  }
}
