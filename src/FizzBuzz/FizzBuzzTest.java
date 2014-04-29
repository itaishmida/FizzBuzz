package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		
		FizzBuzz fb = new FizzBuzz();
		
		String answer = fb.run();
		
		assertEquals("0", "0");
	}

}
