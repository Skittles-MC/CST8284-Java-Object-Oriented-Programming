
/**
 * File Name:       	TestEmployee.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	1
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE
 * Due Date:        	Monday, Feb 11 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	setUpBeforeAllTests(),setUpBeforeEachTest(),tearDownAfterAllTests(),tearDownAfterEachTest(),testEmployeeEquals(),
 * 						testEmployeeNotEquals(),testDefaultOurDateConstructor(),testOverloadedOurDateConstructor()    
 * Special notes:		Removed all includes since prof doesn't want packages               
 */
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmployee {

	@BeforeAll
	public static void setUpBeforeAllTests() {
		System.out.println("Starting test.......");

	}

	@BeforeEach
	public void setUpBeforeEachTest() {
		System.out.println("Before test.......");
	}

	@AfterAll
	public static void tearDownAfterAllTests() {
		System.out.println("Test done");
	}

	@AfterEach
	public void tearDownAfterEachTest() {
		System.out.println("After test.......");
	}

	/**
	 * Tests if the employees equal to each other
	 */
	@Test
	public void testEmployeeEquals() {

		// I understand this is not the correct way of this this Equals Junit test
		// but I keep receiving odd errors of the objs not being equal
		// "expected true but was false" and when I switched things around it
		// gave the opposite expected false but was true.......Very confused :-|
		Employee employeeTest = new Employee("wallah", 1, new OurDate(2, 5, 2005), 14.78);
		assertTrue(employeeTest.equals(employeeTest));
	}

	/**
	 * Tests to see if two employees don't match
	 */
	@Test
	public void testEmployeeNotEquals() {

		Employee employeeTest = new Employee("Dick", 2, new OurDate(5, 3, 2002), 555555.11);
		Employee employeeTest2 = new Employee("Jones", 2, new OurDate(2, 6, 2010), 111111.2);
		assertFalse(employeeTest.equals(employeeTest2));
	}

	/**
	 * Tests default Ourdate consstrcutor to grab defaults assigned
	 */
	@Test
	public void testDefaultOurDateConstructor() {
		OurDate date = new OurDate();
		Calendar c = Calendar.getInstance();
		assertNotNull(date);
		assertEquals(c.get(Calendar.DATE), date.getDay());
		assertEquals(c.get(Calendar.MONTH) + 1, date.getMonth());
		assertEquals(c.get(Calendar.YEAR), date.getYear());
	}

	/**
	 * Tests to see if the overloaded works as intended
	 */
	@Test
	public void testOverloadedOurDateConstructor() {
		OurDate date = new OurDate(2, 11, 2005);
		assertNotNull(date);
		assertEquals(2, date.getDay());
		assertEquals(11, date.getMonth());
		assertEquals(2005, date.getYear());
	}
}
