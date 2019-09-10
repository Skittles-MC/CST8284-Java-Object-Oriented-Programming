
/**
 * File Name:       	Temp.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	3
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, April 14 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getEndContractDate(),setEndContractDate(),loadExtraInfo(),equals(),toString()     
 * Special notes:		Removed all includes since prof doesn't want packages               
 */
import java.util.Scanner;

public class Temp extends Employee{
	private OurDate endContractDate;
	public static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Temp() {
		this("Wallah", 1, new OurDate(), 1.0,new OurDate());
	}

	/**
	 * Description: Parameterized constructor
	 * @param name - employee name
	 * @param employeeNumber - employee number
	 * @param startDate - employee start date
	 * @param salary - employee salary
	 * @param endContractDate - employee end date
	 * @version 1.0
	 */
	public Temp(String name, int employeeNumber, OurDate startDate, double salary, OurDate endContractDate) {
		super(name, employeeNumber, startDate, salary);
		setEndContractDate(endContractDate);
	}

	/**
	 * Description: getter
	 * @return endContractDate
	 * @version 1.0
	 */
	public OurDate getEndContractDate() {
		return endContractDate;
	}

	/**
	 * Description: setter
	 * @param endContractDate - end date
	 * @version 1.0
	 */
	public void setEndContractDate(OurDate endContractDate) {
		this.endContractDate = endContractDate;
	}

	/**
	 * Description: Loads additional information on the employee
	 */
	@Override
	public void loadExtraInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("DAY: ");
		int day = input.nextInt();
		System.out.print("MONTH: ");
		int month = input.nextInt();
		System.out.print("YEAR: ");
		int year = input.nextInt();
		setEndContractDate(new OurDate(day, month, year));
	}
	
	/**
	 * Description: compares objects
	 * @param obj - employee object
	 * @return true
	 * @return false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp tempEq = (Temp) obj;
		if (endContractDate == null) {
			if (tempEq.endContractDate != null)
				return false;
		} else if (!endContractDate.equals(tempEq.endContractDate))
			return false;
		return true;
	}

	/**
	 * Description: prints out end date
	 * @return super.toString
	 * @version 1.0
	 */
	@Override
	public String toString() {
		return super.toString() +"End of Contract: "  + endContractDate + "\t||" ;
	}
}
