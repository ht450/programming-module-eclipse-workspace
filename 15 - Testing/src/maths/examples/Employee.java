package maths.examples;

import java.util.ArrayList;

public class Employee {

	private String name;
	private int age;

	private final int LOWER_AGE = 18;
	private final int UPPER_AGE = 30;

	/**
	 * default constructor
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age) {
		this.name = name;
		this.setAge(age);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * sets age
	 * 
	 * @param age 18 - 30
	 * @throws IllegalArgumentException if age is beyond of 18 and 30
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age >= LOWER_AGE && age <= UPPER_AGE) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Age outside values " + LOWER_AGE + " and " + UPPER_AGE);
		}
	}
	
	/**
	 * method searches all employees and returns an arraylist of all below the search age.
	 * 
	 * @param employees
	 * @param age
	 * @return
	 */
	public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age){
		ArrayList<Employee> employeesBelowSearchAge = new ArrayList<Employee>();
		for(Employee e: employees) {
			if(e.getAge()<=age) {
				employeesBelowSearchAge.add(e);
			}
		}
		return employeesBelowSearchAge;
	}

}
