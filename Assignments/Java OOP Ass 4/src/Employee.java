
/**
 * File Name:       	Employee.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getName(),getEmployeeNumber(),getStartDate(),getSalary(),setName(),setEmployeeNumber(),setStartDate(),setSalary()
 * 						toString(), loadExtraInfo()   
 * Special notes:		Removed all includes since prof doesn't want packages                       
 */



import java.io.Serializable;
import java.util.Scanner;

public abstract class Employee implements Serializable{
	/**
	 * @serial 
	 */
	public static final long serialVersionUID = 1L;
	/**
	 * name of the employee
	 */
	private String name;
	/**
	 * employee number
	 */
	private int employeeNumber;
	/**
	 * employ starting date
	 */
	private OurDate StartDate;
	/**
	 * employee's salary
	 */
	private double salary;
	

	/**
	 * Default constructor
	 */
	public Employee() {
		this.setName("unkown");
		this.setEmployeeNumber(-9);
		this.setSalary(-1);
		this.setStartDate(new OurDate());
	}

	/**
	 * Overloaded Constructor, take four parameters
	 * @param name employee's name
	 * @param employeeNumber employee's id
	 * @param startDate employee's starting employee date
	 * @param salary employee's salary
	 */
	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {
		this();
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setSalary(salary);
		this.setStartDate(startDate);
	}
	/**
	 * Getter : get the name
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Getter : get the employeeNumber
	 * @return employeeNumber
	 */
	public int getEmployeeNumber() {
		return this.employeeNumber;
	}

	/**
	 * Getter : get the StartDate
	 * 
	 * @return StartDate
	 */
	public OurDate getStartDate() {
		return this.StartDate;
	}

	/**
	 * Getter : get the salary
	 * @return salary
	 */
	public double getSalary() {
		return this.salary;
	}

	/**
	 * Setter : set the name 
	 * @param name
	 */
	private void setName(String name) {
		this.name = name;
	}

	/* Private: Method: set the Employee Number
	 */
	/**
	 * Setter : set the employeeNumber 
	 * @param employeeNumber
	 */
	private void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/* Private: Method: set the Starting Date
	 */
	/**
	 * Setter : set the ourDate
	 * @param ourDate
	 */
	private void setStartDate(OurDate ourDate) {
		
		this.StartDate = ourDate;

	}

	/**
	 * Setter : set the salary
	 * @param salary
	 */
	private void setSalary(double salary) {
		
		this.salary = salary;

	}
	

	/* Method : abstract function ,Load extra info
	 * 		load extra information of the employee
	 * return: String
	 */
	/**
	 * Abstaract method to load the extra info
	 * @param input Scanner to receive the user input
	 */
	public abstract void loadExtraInfo(Scanner input);
	
	/* Method : override toString
	 * return: String
	 */
	public abstract String getExtraInfo();
	public abstract void setExtraInfo(String s);
	
	public String toString() {
		
		return this.name + "\t\t" + this.employeeNumber + "\t " + this.getStartDate().toString() + "\t" + this.salary;
	}
	/* Method : override equals
	 * return : boolean
	 */
	@Override
	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee e = (Employee) obj;
		return this.getName().equals(e.getName()) && this.getEmployeeNumber() == e.getEmployeeNumber()
					&& this.getSalary() == e.getSalary() && this.getStartDate().equals(e.getStartDate());

	}


}