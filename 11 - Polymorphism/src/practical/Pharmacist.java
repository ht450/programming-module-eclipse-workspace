/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Pharmacist extends Employee {

	private int grade;
	private double bonus;
	
	/**
	 * 
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	/**
	 * method calculates pharmacist's weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		double salary = (this.getBaseRate()*hours) + this.bonus;
		System.out.printf("%-10s %-10s [%-10s] : %.2fhrs * £%.2f + £%.2f = £%.2f\n", getFirstName(), getLastName(), "Pharmacist", hours, getBaseRate(), this.bonus, salary);
	}
	/**
	 * method prints out all the pharmacist's details
	 */
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-10s %-10s %.2f Bonus: %s, Grade: %s\n", "Pharmacist", getFirstName(), getLastName(), getBaseRate(), this.bonus, this.grade);
	}
	
	
	

}
