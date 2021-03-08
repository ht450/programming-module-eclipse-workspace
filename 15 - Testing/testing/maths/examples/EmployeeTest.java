package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	// test data
	Employee employee;

	String validName;

	int validAgeLower, validAgeUpper, validAgeMid;

	int invalidAgeLower, invalidAgeUpper;

	@BeforeEach
	void setUp() throws Exception {
		validName = "Valid Name";
		employee = new Employee();

		validAgeLower = 18;
		validAgeUpper = 30;
		validAgeMid = 24;

		invalidAgeLower = 17;
		invalidAgeUpper = 31;
	}

	@Test
	void testSetGetName() {
		employee.setName(validName);
		assertEquals(validName, employee.getName());
	}

	/**
	 * Test valid ages. Lower and upper boundary and a mid value
	 */
	@Test
	void testValidAge() {

		employee.setAge(validAgeLower);
		assertEquals(validAgeLower, employee.getAge());

		employee.setAge(validAgeMid);
		assertEquals(validAgeMid, employee.getAge());

		employee.setAge(validAgeUpper);
		assertEquals(validAgeUpper, employee.getAge());
	}

	/**
	 * Tests setting upper and lower ages.
	 */
	@Test
	public void setInvalidAge() {
		Exception eLower = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(invalidAgeLower);

		});
		System.out.println("Invalid Lower Age: " + eLower.getMessage());

		Exception eUpper = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(invalidAgeUpper);

		});
		System.out.println("Invalid Upper Age: " + eUpper.getMessage());

	}

	/**
	 * Test the constructor with valid args
	 */
	@Test
	void testConstructorValid() {
		Employee employee = new Employee(validName, validAgeMid);

		assertEquals(validName, employee.getName());
		assertEquals(validAgeMid, employee.getAge());
	}

	/**
	 * Test the constructor with invalid age
	 */
	@Test
	void testConstructorInvalidAge() {
		assertThrows(IllegalArgumentException.class, () -> {
			Employee employee = new Employee(validName, invalidAgeLower);
		});
	}
	
	@Test
	void testGetAllEmployeesByAge() {

		// create three employees
		Employee e1 = new Employee("E1 Name", 29);
		Employee e2 = new Employee("E2 Name", 23);
		Employee e3 = new Employee("E3 Name", 21);
		
		int searchLimit = 25;
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		ArrayList<Employee> searchResults = Employee.getAllEmployeesByAge(employees, searchLimit);
		
		// this can be done two ways
		if (searchResults.contains(e2) && searchResults.contains(e3)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		// or...
		assertTrue(searchResults.contains(e2) && searchResults.contains(e3)); 
		
	}
}
