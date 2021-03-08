/**
 * 
 */
package wed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Hugh
 *
 */
class FootballerTest {

	// test data
	Footballer f;
	int validAgeLower, validAgeUpper, validAgeMid;
	int invalidAgeLower, invalidAgeUpper;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		f = new Footballer();

		validAgeLower = 16;
		validAgeUpper = 40;
		validAgeMid = 28;

		invalidAgeLower = 15;
		invalidAgeUpper = 41;
	}

	/**
	 * Test method for {@link wed.Footballer#Footballer()}.
	 */
	@Test
	void testFootballer() {
		Footballer footballer = new Footballer();
		assertNotNull(footballer);
	}

	// set age between 16-40 (inclusive)
	@Test
	void testAgeValid() {
		Footballer f = new Footballer();

		f.setAge(validAgeLower);
		assertEquals(validAgeLower, f.getAge());

		f.setAge(validAgeMid);
		assertEquals(validAgeMid, f.getAge());

		f.setAge(validAgeUpper);
		assertEquals(validAgeUpper, f.getAge());

	}

	@Test
	void testAgeInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(invalidAgeLower);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(invalidAgeUpper);
		});
		
		
	}

}
