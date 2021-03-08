/**
 * 
 */
package exercise.extra;

/**
 * @author Hugh
 *
 */
public class UniversityPayroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student stu = new Student("Stew", "Dent", 123);
		Reader read = new Reader("Rach", "Readen", "Religion");
		Lecturer lect = new Lecturer("Tim", "Teach", "Trigonometry");
		
		stu.displayAll();
		System.out.println();
		
		read.displayAll();
		read.payWage(10, 10);
		System.out.println();
		
		lect.displayAll();
		lect.payWage(10, 10);
	}

}
