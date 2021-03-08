package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeMakerTest {

	// test data
	Circle c1, c2;
	Square s1, s2;
	Rectangle r1, r2;
	
	String c1ShapeNameValid;
	double c1RadiusValid;
	
	String c2ShapeNameValid;
	double c2RadiusValid;
	
	String s1ShapeNameValid;
	double s1WidthValid;
	
	String s2ShapeNameValid;
	double s3WidthValid;
	
	String r1ShapeNameValid;
	double r1HeightValid, r1WidthValid;
	
	String r2ShapeNameValid;
	double r2HeightValid, r2WidthValid;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Circle();
		c1ShapeNameValid = "c1";
		c1RadiusValid = 5.00;
		
		c2 = new Circle();
		c2ShapeNameValid = "c2";
		c2RadiusValid = 5.00;
		
		s1 = new Square();
		s1ShapeNameValid = "s1";
		s1WidthValid = 5.00;
		
		s2 = new Square();
		s2ShapeNameValid = "s2";
		s3WidthValid = 5.00;
		
		r1 = new Rectangle();
		r1ShapeNameValid = "r1";
		r1HeightValid = 5.00;
		r1WidthValid = 5.00;
		
		r2 = new Rectangle();
		r2ShapeNameValid = "r2";
		r2HeightValid = 5.00;
		r2WidthValid = 5.00;
	}

	
	@Test
	void testGenerateShapes() {
		
		assertFalse(ShapeMaker.generateShapes(1).isEmpty());
		
		assertTrue(ShapeMaker.generateShapes(1).get(0) instanceof IMyShape);
		
		
	}

}
