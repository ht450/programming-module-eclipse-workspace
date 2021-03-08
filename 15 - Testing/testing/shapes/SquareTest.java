package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {

	// test data
	Square square;
	
	String shapeNameValid;
	double widthValid;
	
	@BeforeEach
	void setUp() throws Exception {
		square = new Square();
		
		shapeNameValid = "ValidName";
		widthValid = 5.0;
	}

	@Test
	void testSquareDefaultConst() {
		assertNotNull(square);
	}

	@Test
	void testSquareValidConstWithArgs() {
		
		Square squareConstWithArgs = new Square(shapeNameValid, widthValid);
		
		assertEquals("Square_"+shapeNameValid, squareConstWithArgs.getShapeName());
		assertEquals(widthValid, squareConstWithArgs.getWidth());
	}

	@Test
	void testGetSetWidth() {
		square.setWidth(widthValid);
		assertEquals(widthValid, square.getWidth());
	}

	@Test
	void testGetSetShapeName() {
		square.setShapeName(shapeNameValid);
		assertEquals(shapeNameValid, square.getShapeName());
	}
	
	@Test
	void testCalculatePerimeter() {
		
		square.setWidth(widthValid);
		
		double expected = 20.0;
		double actual = square.calculatePerimeter();
		
		assertEquals(expected, actual);
	}

	@Test
	void testCalculateArea() {

		square.setWidth(widthValid);
		
		double expected = 25.0;
		double actual = square.calculateArea();
		
		assertEquals(expected, actual);
	}

}
