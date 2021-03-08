/**
 * 
 */
package abstraction;

/**
 * @author Hugh
 *
 */
public class PayrollManagerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Employee e1 = new Employee("Any","Body");
//		e1.calSalary(20, 2);
		
		Lecturer l1 = new Lecturer("A","Lecturer","CS");
		l1.calSalary(20, 2);
		
		Reader r1 = new Reader("A","Reader","AI");
		r1.calSalary(20, 2);
		
		
	}

}
