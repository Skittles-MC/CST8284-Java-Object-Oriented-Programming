
/**
 * File Name:       	Temp.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getEndContractDate(),setEndContractDate(),loadExtraInfo(),equals(),toString()                  
 */
import java.util.Scanner;

public class Temp extends Employee{
	private OurDate endContractDate;

	/**
	 * Default constructor
	 */
	public Temp() {
		this("Wallah", 1, new OurDate(), 1.0,new OurDate());
	}

	/**
	 * Description: Parameterized constructor
	 * @param name
	 * @param employeeNumber
	 * @param startDate
	 * @param salary
	 * @param endContractDate
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
	 * @param endContractDate
	 * @version 1.0
	 */
	public void setEndContractDate(OurDate endContractDate) {
		this.endContractDate = endContractDate;
	}

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

	@Override
	public String toString() {
		return super.toString() +"End of Contract: "  + endContractDate + "\t||" ;
	}
}
