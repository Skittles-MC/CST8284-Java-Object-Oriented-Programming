
/**
 * File Name:       	Staff.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getDepartment(),setDepartment(),loadExtraInfo(),equals(),toString()                  
 */
import java.util.Scanner;

public class Staff extends Employee{
	private String department;
	
	/**
	 * Default constructor
	 */
	public Staff() {
		this("Bob", 1, new OurDate(), 1.0,"member");
	}

	/**
	 * Description: Parameterized constructor
	 * @param name
	 * @param employeeNumber
	 * @param startDate
	 * @param salary
	 * @param department
	 * @version 1.0
	 */
	public Staff(String name, int employeeNumber, OurDate startDate, double salary, String department) {
		super(name, employeeNumber, startDate, salary);
		this.setDepartment(department);
	}

	/**
	 * Description: getter
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Description: setter
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Description: Will load and set extra info pertaining to the type of employee
	 * @version 1.0
	 */
	@Override
	public void loadExtraInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Department: ");
		String departmentInput = input.nextLine();
		setDepartment(departmentInput);
	}

	/**
	 * Description: ton of comparing
	 * @version 1.0
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff departmentEq = (Staff) obj;
		if (department == null) {
			if (departmentEq.department != null)
				return false;
		} else if (!department.equals(departmentEq.department))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() +"Department: " + department  + "\t\t||";
	}
}