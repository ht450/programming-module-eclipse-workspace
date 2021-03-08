package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathsSequenceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDoubleUp() {
		
		// test data
		int seed = 2;
		int number = 4;
		int[] expected = {2,4,8,16};
		
		MathsSequence sequencer = new MathsSequence();
		int[] actual = sequencer.doubleUp(seed, number);
		
		System.out.println(Arrays.toString(actual));
		boolean match = false;
		// checking the values are the same as expected
		for (int loop=0; loop<expected.length; loop++) {
			if(expected[loop] == actual[loop]) {
				match = true;
			} else {
				// not a match
				match = false; // set flag to false
				break; // leave loop
			}
		}
		// overall result
		assertTrue(match);
		
	}

}
