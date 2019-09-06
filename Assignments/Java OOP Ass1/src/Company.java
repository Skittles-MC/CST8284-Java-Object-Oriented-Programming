
/**
 * File Name:       	Company.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	1
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE
 * Due Date:        	Monday, Feb 11 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	addEmployee(),currentNumberEmployees(),isMaximumEmployees(),getEmployees(),findSeniorEmployee()                  
 * Special notes:		Removed all includes since prof doesn't want packages    
 */
import java.util.Calendar;

/**
 * Represents an abstraction of a Company
 * 
 * @author Martin Choy
 * @version 1
 */
public class Company {

	/**
	 * Data members/variables
	 */
	private Employee[] employees;
	private static int numberEmployees;
	private static int MAXNUMEMPLOYEES = 10;

	/**
	 * Default constructor
	 */
	public Company() {
		employees = new Employee[MAXNUMEMPLOYEES];
		numberEmployees = 0;
		// added the sample run data into the company
		// will make running and testing my program easier since you wont have
		// to
		// manual input all the data and test it all
		// **by default I wouldn't do this tho since instructions doesn't
		// specify this
		addEmployee("Alvin Spring", 14, new OurDate(2, 12, 2014), 150000);
		addEmployee("Grant Barge", 21, new OurDate(18, 5, 2009), 40000);
		addEmployee("Ross Chuttle", 23, new OurDate(22, 2, 2010), 43269.52);
	}

	/**
	 * Method used to add additional employees into the array of Employee Will
	 * first check using the isMaximumEmployees() method
	 * 
	 * @param name
	 * @param employeeNumber
	 * @param startDate
	 * @param salary
	 */
	public void addEmployee(String name, int employeeNumber, OurDate startDate, double salary) {
		if (!isMaximumEmployees()) {
			employees[numberEmployees] = new Employee(name, employeeNumber, startDate, salary);
			numberEmployees++;
		}
	}

	/**
	 * Method used to grab the current number of employees in array
	 * 
	 * @return numberEmployees
	 */
	public int currentNumberEmployees() {
		return numberEmployees;
	}

	/**
	 * If current number of employees is less than 10 return false else true
	 * 
	 * @return false or true
	 */
	public boolean isMaximumEmployees() {
		if (currentNumberEmployees() < MAXNUMEMPLOYEES)
			return false;
		else
			return true;
	}

	/**
	 * A getter for employees
	 * 
	 * @return employees
	 */
	public Employee[] getEmployees() {
		return employees;
	}

	/**
	 * Cycles through each employee and compares dates using Calendar: .before
	 * == compareTo(when) < 0
	 * 
	 * @return seniorEmp
	 */
	public Employee findSeniorEmployee() {
		Employee seniorEmp = new Employee();
		Calendar seniorDate = Calendar.getInstance();
		seniorDate.set(seniorEmp.getStartDate().getYear(), seniorEmp.getStartDate().getMonth(),
				seniorEmp.getStartDate().getDay());
		for (int i = 0; i < currentNumberEmployees(); i++) {
			Calendar employeeDate = Calendar.getInstance();
			employeeDate.set(employees[i].getStartDate().getYear(), employees[i].getStartDate().getMonth(),
					employees[i].getStartDate().getDay());
			if (employeeDate.before(seniorDate)) {
				seniorEmp = employees[i];
				seniorDate.set(seniorEmp.getStartDate().getYear(), seniorEmp.getStartDate().getMonth(),
						seniorEmp.getStartDate().getDay());
			}
		}
		return seniorEmp;
	}
}
