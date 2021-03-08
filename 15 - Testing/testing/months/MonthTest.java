package months;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * testing valid outcomes
	 */
	@Test
	void testMonthsValid() {
		
		assertEquals("Janurary", Month.monthIntToString(1));
		assertEquals("Feburary", Month.monthIntToString(2));
		assertEquals("March", Month.monthIntToString(3));
				
	}

	/**
	 * testing invalid outcomes
	 */
	@Test
	void testMonthsInvalid() {
		
		assertThrows(NumberFormatException.class, () -> {
			Month.monthIntToString(0);
		});
		
		assertThrows(NumberFormatException.class, () -> {
			Month.monthIntToString(13);
		});
		
	}
}
