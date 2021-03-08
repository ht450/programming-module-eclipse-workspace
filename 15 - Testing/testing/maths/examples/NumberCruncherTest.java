package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {

	// test data
	int num1;
	int num2;
	int num3;
	NumberCruncher nc;

	@BeforeEach
	void setUp() throws Exception {
		num1 = 2;
		num2 = 4;
		num3 = 6;
		nc = new NumberCruncher();
	}

	@Test
	void testAddNumbersIntInt() {
		System.out.println("about to test addNumbers(int, int)");

		int expected = num1 + num2;
		int actual = nc.addNumbers(num1, num2);

		assertEquals(expected, actual);
	}

	@Test
	void testAddNumbersIntIntInt() {
		System.out.println("about to test addNumbers(int, int, int)");

		int expected = num1 + num2 + num3;
		int actual = nc.addNumbers(num1, num2, num3);

		assertEquals(expected, actual);
	}

	@Test
	void testDivNumbers() {
		// double expected = (double) num1 / (double) num2;
		// double actual = nc.divNumbers(num1, num2);

		double expected = 3.33;
		double actual;
		try {
			actual = nc.divNumbers(10, 3);

			assertEquals(expected, actual, 0.01);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * this test case will check division by zero
	 */
	@Test
	void divNumbersException() {
		double num1, num2;
		num1 = 2;
		num2 = 0;
		
		Exception exception = assertThrows(Exception.class, () -> {
			nc.divNumbers(num1, num2);
		});
		
	}

}
