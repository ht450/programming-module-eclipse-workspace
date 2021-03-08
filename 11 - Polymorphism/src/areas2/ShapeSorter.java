/**
 * 
 */
package areas2;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class ShapeSorter {

	/**
	 * 
	 */
	public ShapeSorter () {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape s1 = new Shape("A shape !");
		s1.area();
		
		Circle c1 = new Circle("C1", 2.9);
		c1.area();
		
		Circle c2 = new Circle("C2", 0);
		c2.area();
		
		Rectangle r1 = new Rectangle("R1", 2,3);
		r1.area();
		
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(s1);
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(r1);
		
		System.out.println("Method:");
		calculateAreas(shapes);
	}

	
	public static void calculateAreas(ArrayList<Shape> shapes) {
		for (Shape shape : shapes) {
			shape.area();
		}
	}
	
}//class

