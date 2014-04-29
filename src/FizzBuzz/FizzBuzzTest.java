package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		
		FizzBuzz fb = new FizzBuzz();
		
		assertEquals("0", fb.run(0));
		assertEquals("1", fb.run(1));
	}

}
