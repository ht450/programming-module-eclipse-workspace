/**
 * 
 */
package areas;

/**
 * @author Hugh
 *
 */
public class ShapeFactory {

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circle c1 = new Circle(2.00);		
		calculateArea(c1);
		
		Rectangle r1 = new Rectangle(2,4);
		calculateArea(r1);
		
		Triangle t1 = new Triangle(4, 2);
		calculateArea(t1);
		
		
	}
	
	public static void calculateArea(Shape s) {
		s.area();
	}
	

}
