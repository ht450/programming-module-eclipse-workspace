/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Pharmacist extends Employee implements AdministerDrugs {

	private int grade;
	private double bonus;
	
	/**
	 * default constructor
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param grade
	 * @param bonus
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
	 * method returns whether a pharmacist can administer controlled drugs
	 */
	@Override
	public boolean adminControlledDrug() {
		return true;
	}

	/**
	 * method returns whether a pharmacist can administer non- controlled drugs
	 */
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}

	/**
	 * method calculates and prints this pharmacist's weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println("Weekly salary : £" + (hours*this.getBaseRate()+this.bonus));
	}

	/**
	 * method prints all the instance vars for this pharmacist
	 */
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Grade : " + this.grade);
		System.out.println("Bonus : "+this.bonus);
	}

}
