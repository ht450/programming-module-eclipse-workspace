/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class MethodsWithParameters {

	/**
	 * method to calculate the week of the year number
	 */
	public void weekOfYear () {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int dayOfMonth = cal.get(java.util.Calendar.WEEK_OF_YEAR);
		System.out.println("Week Number : "+String.valueOf(dayOfMonth));
	}//end of weekOfYear
	
	/**
	 * method that calculates the area of a circle
	 */
	public void areaOfCircle (double radius) {
		System.out.println(Math.PI*(radius*radius));
	}//end of areaOfCircle
	
	/**
	 * method that calculates the area of a triangle
	 */
	public void areaOfTriangle(double breadth, double height) {
		double area = (breadth/2)*height;
		System.out.println(area);
	}//end of areaOfTriangle
	
	
	/**
	 * main method
	 * @param args
	 * @author Hugh
	 */
	public static void main(String[] args) {
		//need to create the class as these methods are NON static
		MethodsWithParameters methodsWithParameters = new MethodsWithParameters();
		
		methodsWithParameters.weekOfYear();
		
		methodsWithParameters.areaOfCircle(2.0);
		
		methodsWithParameters.areaOfTriangle(3, 7);
		
	}

}
