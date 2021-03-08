/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class PayrollManager {

	public static double HOURS_PER_WEEK = 35;
	public static Employee[] employees = new Employee[6];

	public static void main(String[] args) {

		PayrollManager pay = new PayrollManager();

		Employee e1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee e2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee e3 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee e4 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee e5 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);

		pay.addEmployeeToList(e1);
		pay.addEmployeeToList(e2);
		pay.addEmployeeToList(e3);
		pay.addEmployeeToList(e4);
		pay.addEmployeeToList(e5);

		pay.displayAllEmployees();
		
		pay.processWeeklyPayroll();
		
	}

	/**
	 * adds an employee to the employees list (if there is a space free)
	 * 
	 * @param employee
	 */
	public void addEmployeeToList(Employee employee) {
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
	}

	/**
	 * prints the details of all employees in the employees array
	 */
	public void displayAllEmployees() {
		System.out.println("\nDisplay all employees____________________________");
		int employeeCount=0;
		System.out.printf("[%-10s] %-10s %-10s Rate\t Other\n", "Type", "First Name", "Last Name", "Rate");
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] != null) {
				employees[loop].printAll();
				employeeCount++;
			}
		}
		System.out.println("Total employees in the system: "+employeeCount);
		System.out.println("_________________________________________________");
	}

	/**
	 * calculates the weekly salary for all employees in the employees array
	 */
	public void processWeeklyPayroll() {
		System.out.println("\nPayroll Run______________________________________");
		int employeeCount=0;
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] != null) {
				employees[loop].calculateWeeklySalary(HOURS_PER_WEEK);
				employeeCount++;
			}
		}
		System.out.println("Total records processed: "+employeeCount);
		System.out.println("_________________________________________________");
	}

	/**
	 * 
	 */
	public PayrollManager() {
		// TODO Auto-generated constructor stub
	}
}
