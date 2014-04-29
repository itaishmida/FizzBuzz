package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		
		FizzBuzz fb = new FizzBuzz();
		
		assertEquals("0", fb.run(0));
		assertEquals("1", fb.run(1));
		assertEquals("2", fb.run(2));
		assertEquals("fizz", fb.run(3));
		assertEquals("4", fb.run(4));
		assertEquals("buzz", fb.run(5));
		assertEquals("fizz", fb.run(6));
		assertEquals("7", fb.run(7));
		assertEquals("8", fb.run(8));
		assertEquals("fizz", fb.run(9));
		assertEquals("buzz", fb.run(10));
	}

}
