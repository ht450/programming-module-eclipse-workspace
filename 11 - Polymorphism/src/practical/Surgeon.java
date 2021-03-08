/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Surgeon extends Employee {

	private String specialistArea;
	private double consultationFee;
	
	/**
	 * 
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.consultationFee = consultationFee;
		this.specialistArea = specialistArea;
	}
	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}
	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}
	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}
	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	/**
	 * method calculates surgeon's weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		double salary = (this.getBaseRate()*hours) + this.consultationFee;
		System.out.printf("%-10s %-10s [%-10s] : %.2fhrs * £%.2f + £%.2f = £%.2f\n", getFirstName(), getLastName(), "Surgeon", hours, getBaseRate(), this.consultationFee, salary);
	}
	/**
	 * method prints all surgeons deteails
	 */
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-10s %-10s %.2f Fee: %s, Specialism: %s\n", "Surgeon", getFirstName(), getLastName(), getBaseRate(), this.consultationFee, this.specialistArea);
	}
	

}
