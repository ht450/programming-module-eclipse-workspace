package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {

	// test data
	Circle circle;
	String shapeNameValid;
	double radiusValid;

	@BeforeEach
	void setUp() throws Exception {
		shapeNameValid = "ValidName";
		radiusValid = 5.00;
		circle = new Circle();
	}

	@Test
	void testCircleDefaultConst() {
		assertNotNull(circle);
	}

	@Test
	void testCircleValidConstWithArgs() {
		Circle circleConstWithArgs = new Circle(shapeNameValid, radiusValid);
		assertEquals("Circle_" + shapeNameValid, circleConstWithArgs.getShapeName());
		assertEquals(radiusValid, circleConstWithArgs.getRadius());
	}

	@Test
	void testGetSetRadius() {
		circle.setRadius(radiusValid);
		assertEquals(radiusValid, circle.getRadius());
	}

	@Test
	void testGetSetShapeName() {
		circle.setShapeName(shapeNameValid);
		assertEquals(shapeNameValid, circle.getShapeName());
	}
	
	@Test
	void testCalculatePerimeter() {

		circle.setRadius(radiusValid);

		double expected = 31.41;
		double actual = circle.calculatePerimeter();

		assertEquals(expected, actual, 0.01);
	}

	@Test
	void testCalculateArea() {

		circle.setRadius(radiusValid);

		double expected = 78.54;
		double actual = circle.calculateArea();

		assertEquals(expected, actual, 0.01);
	}

}
