/**
 * 
 */
package student;

/**
 * @author Hugh
 *
 */
public class StudentRecordManager {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create a student
		Student student1 = new Student();
		student1.setName("Stew");
		
		// create another student
		Student student2 = new Student();
		student2.setName("Dent");
		
		// show details of the students
		System.out.println(student1.getName());
		System.out.println(student2.getName());
	}

}
