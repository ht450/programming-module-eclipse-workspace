package challenge2;

public class Q2 {

	private int age;
	
	/**
	* Sets the age
	* @param age 18 - 30 (inclusive) valid - invalid throws an exception
	* @throws IllegalArgumentException
	*/
	public void setAge(int age) throws IllegalArgumentException {
	    
		if (age >= 18 && age <= 30) {
			this.age = age;			
		} else {
			throw new IllegalArgumentException("Invalid number! must be 18-30");
		}
	}
}
