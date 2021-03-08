/**
 * 
 */
package wages.manager;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class PayManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee("M","Loye", 20);
		Lecturer l1 = new Lecturer("L", "Turing", 20, "ED");
		Reader r1 = new Reader("T","Reed", 20, "Comp. Sci.");
		Professor p1 = new Professor("P","Rufus",20,"EEECS");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(l1);
		employees.add(r1);
		employees.add(p1);
		
		processPay(employees, 20);
		
	}
	
	public static void processPay(ArrayList<Employee> employees, int hours) {
		
		for (Employee e : employees) {
			e.calWeeklyWage(hours);
		}
		
	}
}
