/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Surgeon extends Employee implements AdministerDrugs {

	private String specialistArea;
	private double consultationFee;
	
	/**
	 * default constructor
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param specialistArea
	 * @param consultationFee
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
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
	 * method calculates and prints this surgeon's weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println("Weekly salary : £" + (hours*this.getBaseRate()));
	}
	
	/**
	 * method prints all the instance vars for this surgeon
	 */
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Specialist Area : " + this.specialistArea);
		System.out.println("Consultation Fee : "+this.consultationFee);
	}

	/**
	 * method returns whether a surgeon can administer controlled drugs
	 */
	@Override
	public boolean adminControlledDrug() {
		return false;
	}

	/**
	 * method returns whether a surgeon can administer non- controlled drugs
	 */
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}

}
