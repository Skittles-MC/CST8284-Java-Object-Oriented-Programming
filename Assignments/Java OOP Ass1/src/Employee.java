/**
 * File Name:       	Employee.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	1
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE
 * Due Date:        	Monday, Feb 11 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getName(),getEmployeeNumber(),getStartDate(),getSalary(),setName(),setEmployeeNumber(),setStartDate(),setSalary()
 * 						toString()                   
 * Special notes:		Removed all includes since prof doesn't want packages      
 */

/**
 * This class stores all information relating to employee
 * Name, employee numbers, Start dates and their salaries 
 * @author Martin Choy
 * @version 1
 */
public class Employee {

	/**
	 * Data members/variables
	 */
	private String name;
	private int employeeNumber;
	private OurDate startDate;
	private double salary; 
	/**
	 * Parameterized constructor
	 * @param name
	 * @param employeeNumber
	 * @param startDate
	 * @param salary
	 */
	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setStartDate(startDate);
		this.setSalary(salary);
	}
	
	/**
	 * Default constructor
	 * Initial values set is specified from assignment instructions
	 */
	public Employee(){
		this("unknown",-9,new OurDate(), -1);
	/*			or
				this.name = "unkown";
				this.employeeNumber= -9;
				this.startDate = new OurDate();
				this.salary = -1;*/
	}
	/**
	 * 	Gets the name
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Get the employee number
	 * @return employeeNumber
	 */
	public int getEmployeeNumber(){
		return employeeNumber;
	}
	/**
	 * Get the start date 
	 * @return startDate
	 */
	public OurDate getStartDate() {
		return startDate;
	}
	/**
	 * Get the salary
	 * @return salary
	 */
	public double getSalary(){
		return salary;	
	}
	
	/**
	 * Set the name
	 * @param name
	 */
	private void setName(String name){
		this.name= name;
	}
	
	/**
	 * Set the employee number
	 * @param employeeNumber
	 */
	private void setEmployeeNumber(int employeeNumber){
		this.employeeNumber = employeeNumber;
	}
	
	/**
	 * set the start date
	 * @param startDate
	 */
	private void setStartDate(OurDate startDate){
		this.startDate = startDate;
	}
	
	/**
	 * set the salary
	 * @param salary
	 */
	private void setSalary(double salary){
		this.salary = salary;
	}
	
	/**
	 * Spits out name,employeeNumber,startDate,salary formatted 
	 * @return formatted print for the console class
	 */
	public String toString(){
		return String.format("||%-17s||%-17d||%-17s||%-17.2f||%n",name,employeeNumber,startDate,salary);
	}
	
	/**
	 * ton of comparing
	 * @return true or false
	 */
	@Override
	public boolean equals(Object obj){
		if(this==obj) {
			return true;
		}
				if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Employee testingEmployee = (Employee) obj;
		return this.getName().equals(testingEmployee.getName()) && this.getEmployeeNumber() == testingEmployee.getEmployeeNumber() 
		&& this.getStartDate().equals(testingEmployee.getStartDate() );
	}
	
	
}
