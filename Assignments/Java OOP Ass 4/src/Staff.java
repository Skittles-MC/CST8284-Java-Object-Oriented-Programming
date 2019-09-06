
/**
 * File Name:       	Staff.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getDepartment(),setDepartment(),loadExtraInfo(),equals(),toString()      
 * Special notes:		Removed all includes since prof doesn't want packages              
 */
/**
 * Staff  Class 
 * Parent class : Employee
 */


import java.util.Scanner;


public class Staff extends Employee {
	/**
	 * @serial
	 */
	private static final long serialVersionUID = 1L;
	private String department;

	/**
	 * Default Staff Constructor
	 */
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor, take 4 parameters for Staff
	 * 
	 * @param name Staff employee's name
	 * @param employeeNumber Staff employee's id
	 * @param startDate Staff employee's starting employee date
	 * @param salary Staff employee's salary
	 */
	public Staff(String name, int employeeNumber, OurDate startDate, double salary) {
		super(name, employeeNumber, startDate, salary);

	}

	/**
	 * Overloaded Constructor, take 5 parameters for Staff
	 * 
	 * @param name Staff employee's name
	 * @param employeeNumber Staff employee's id
	 * @param startDate Staff employee's Starting date
	 * @param salary Staff employee's salary
	 * @param department Staff employee's department info
	 */
	public Staff(String name, int employeeNumber, OurDate startDate, double salary, String department) {
		super(name, employeeNumber, startDate, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter : get the department
	 * 
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Setter : set the department
	 * 
	 * @param department department info  of the staff
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Overloaded load ExtraInfo class, load staff employee department info Return :
	 */
	@Override
	public void loadExtraInfo(Scanner input) {

		String department;
		System.out.println("DEPARTMENT IS: ");
		input.nextLine();
		department = input.nextLine();

		this.setDepartment(department);

	}

	/**
	 * Overided toString method from parent class Employee return : String
	 */
	@Override
	public String toString() {
		return super.toString() + "\tStaff [department=" + department + "]";
	}

	/**
	 * Overided equals method from parent class Employee return : boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		return true;
	}

	@Override
	public String getExtraInfo() {
		// TODO Auto-generated method stub
		return this.department;
	}

	@Override
	public void setExtraInfo(String s) {
		this.department = s;
		// TODO Auto-generated method stub
		
	}

}
