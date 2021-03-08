/**
 * 
 */
package shapes;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Hugh
 *
 */
public class ShapeMaker {

	private static final int NUMBER_OF_SHAPES = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<IMyShape> shapes = generateShapes(NUMBER_OF_SHAPES);
		
		//printShapeName(shapes);
		
		printShapeDetails(shapes);
		
	}
	
	/**
	 * returns an arrayList of a random mix of circles, squares and rectangles.
	 * 
	 * @param numberOfShapes
	 * @return
	 */
	public static ArrayList<IMyShape> generateShapes(int numberOfShapes) {
		Random random = new Random();
		ArrayList<IMyShape> shapes = new ArrayList<IMyShape>();

		int temp=0;
		for (int loop=0; loop<NUMBER_OF_SHAPES; loop++) {
			temp = random.nextInt(3);
			switch (temp) {
			case 0:
				shapes.add(new Circle(Integer.toString(loop), random.nextDouble()*random.nextInt(10)));
				break;
			case 1:
				shapes.add(new Square(Integer.toString(loop), random.nextDouble()*random.nextInt(10)));
				break;
			case 2:
				shapes.add(new Rectangle(Integer.toString(loop), random.nextDouble()*random.nextInt(10), random.nextDouble()*random.nextInt(10)));
				break;
			default:
				break;
			}
		}
		
		return shapes;
	}
	
	/**
	 * method that prints the name of each shape in an arraylist of shapes
	 * 
	 * @param shapes
	 */
	public static void printShapeName(ArrayList<IMyShape> shapes) {
		for (IMyShape shape: shapes) {
			System.out.println(shape.getShapeName());
		}
	}
	
	/**
	 * method that prints the name of each shape in an arraylist of shapes
	 * 
	 * @param shapes
	 */
	public static void printShapeDetails(ArrayList<IMyShape> shapes) {
		for (IMyShape shape: shapes) {
			System.out.printf("Name : %s\n",shape.getShapeName());
			System.out.printf("Area : %f\n",shape.calculateArea());
			System.out.printf("Peri : %f\n",shape.calculatePerimeter());
			System.out.println();
		}
	}

}
