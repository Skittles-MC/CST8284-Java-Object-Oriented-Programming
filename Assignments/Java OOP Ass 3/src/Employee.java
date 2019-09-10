
/**
 * File Name:       	Employee.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	3
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.3
 * Due Date:        	Sunday, April 14 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getName(),getEmployeeNumber(),getStartDate(),getSalary(),setName(),setEmployeeNumber(),setStartDate(),setSalary()
 * 						toString(), loadExtraInfo()   
 * Special notes:		Removed all includes since prof doesn't want packages                       
 */

/**
 * Description: This class stores all information relating to employee
 * 				Name, employee numbers, Start dates and their salaries 
 * @author Martin Choy
 * @version 1.3ish
 */

import java.io.Serializable;

public abstract class Employee implements Serializable {
	/**
	 * Data members/variables
	 */
	public static final long serialVersionUID = 1L;
	private String name;
	private int employeeNumber;
	private OurDate startDate;
	private double salary; 
	/**
	 * Description: Parameterized constructor
	 * @param name - Employee Name
	 * @param employeeNumber - Employee Number
	 * @param startDate - Employee Start date
	 * @param salary - Employee salary
	 * @version 1.2
	 */
	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setStartDate(startDate);
		this.setSalary(salary);
	}
	/**
	 * Description: Default constructor
	 * Notes: Initial values set is specified from assignment instructions
	 * @version 1.2
	 */
	public Employee(){
		this("unknown",2 ,new OurDate(), 2.0);
	}
	/**
	 * Description: Gets the name for the employee
	 * @return name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Description: Get the employee number
	 * @return employeeNumber
	 */
	public int getEmployeeNumber(){
		return employeeNumber;
	}
	/**
	 * Description: Get the start date 
	 * @return startDate
	 */
	public OurDate getStartDate() {
		return startDate;
	}
	/**
	 * Description: Get the salary
	 * @return salary
	 */
	public double getSalary(){
		return salary;	
	}
	/**
	 * Description: Set the name
	 * @param name - Sets employee name
	 */
	private void setName(String name){
		this.name= name;
	}
	/**
	 * Description: Set the employee number
	 * @param employeeNumber - Sets employee Number
	 */
	private void setEmployeeNumber(int employeeNumber){
		this.employeeNumber = employeeNumber;
	}
	/**
	 * Description: set the start date
	 * @param startDate - Sets employee start date
	 */
	private void setStartDate(OurDate startDate){
		this.startDate = startDate;
	}
	/**
	 * Description: set the salary
	 * @param salary - Employee Salary
	 */
	private void setSalary(double salary){
		this.salary = salary;
	}
	
	/**
	 * Description: Spits out name,employeeNumber,startDate,salary formatted 
	 * @return String.format - formatted print for the console class
	 */
	public String toString(){
		return String.format("||%-17s||%-17d||%-17s||%-17.2f||",name,employeeNumber,startDate,salary);
	}
	/**
	 * Description: ton of comparing
	 * @return true
	 * @return false
	 * @param obj - employee object
	 * @version 1.2
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass())	return false;
		Employee testingEmployee = (Employee) obj;
		return name.equals(testingEmployee.getName()) && salary == testingEmployee.getSalary() && employeeNumber == testingEmployee.getEmployeeNumber()
				&& startDate.equals(testingEmployee.getStartDate());
	}
	public abstract void loadExtraInfo();
}
