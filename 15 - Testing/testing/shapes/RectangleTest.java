package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {

	// test data
	Rectangle rectangle;
	
	String shapeNameValid;
	double heightValid;
	double widthValid;
	
	@BeforeEach
	void setUp() throws Exception {
		rectangle = new Rectangle();
		
		shapeNameValid = "ValidName";
		heightValid = 2.00;
		widthValid = 5.00;
	}

	@Test
	void testRectangleDefaultConst() {
		assertNotNull(rectangle);
	}

	@Test
	void testRectangleValidConstWithArgs() {
		
		Rectangle rectConstWithArgs = new Rectangle(shapeNameValid, heightValid, widthValid);
		
		assertEquals("Rect_"+shapeNameValid, rectConstWithArgs.getShapeName());
		assertEquals(heightValid, rectConstWithArgs.getHeight());
		assertEquals(widthValid, rectConstWithArgs.getWidth());
	}

	@Test
	void testGetSetHeight() {
		rectangle.setHeight(heightValid);
		assertEquals(heightValid, rectangle.getHeight());
	}

	@Test
	void testGetSetWidth() {
		rectangle.setWidth(widthValid);
		assertEquals(widthValid, rectangle.getWidth());
	}
	
	@Test
	void testGetSetShapeName() {
		rectangle.setShapeName(shapeNameValid);
		assertEquals(shapeNameValid, rectangle.getShapeName());
	}

	@Test
	void testCalculatePerimeter() {
		rectangle.setHeight(heightValid);
		rectangle.setWidth(widthValid);
		
		double expected = 14.0;
		double actual = rectangle.calculatePerimeter();
		
		assertEquals(expected, actual);
	}

	@Test
	void testCalculateArea() {
		rectangle.setHeight(heightValid);
		rectangle.setWidth(widthValid);
		
		double expected = 10.0;
		double actual = rectangle.calculateArea();
		
		assertEquals(expected, actual);
	}

}
