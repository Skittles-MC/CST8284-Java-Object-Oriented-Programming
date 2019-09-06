
/**
 * File Name:       	Manager.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getTitle(),setTiltle(),loadExtraInfo(),equals(),toString()                  
 */
import java.util.Scanner;

/**
 * Subclass of employees, different type of employee
 * 
 * @author Martin Choy
 * @version 1
 */
public class Manager extends Employee{
	private String title;
	
	/**
	 * Default constructor
	 */
	public Manager() {
		this("PlaceHolder", 1, new OurDate(), 1.0,"Test");
	}

	/**
	 * Description: Parameterized constructor
	 * @param name
	 * @param employeeNumber
	 * @param startDate
	 * @param salary
	 * @param title
	 * @version 1.0
	 */
	public Manager(String name, int employeeNumber, OurDate startDate, double salary, String title) {
		super(name, employeeNumber, startDate, salary);
		this.setTiltle(title);
	}

	/**
	 * Description: get's title
	 * @return title
	 * @version 1.0
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Description: set's title
	 * @return title
	 * @version 1.0
	 */
	public void setTiltle(String title) {
		this.title = title;
	}

	/**
	 * Description: Will load and set extra info pertaining to the type of employee
	 * @version 1.0
	 */
	@Override
	public void loadExtraInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter title: ");
		String titleInput = input.nextLine();
		setTiltle(titleInput);
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
		Manager managerEq = (Manager) obj;
		if (title == null) {
			if (managerEq.title != null)
				return false;
		} else if (!title.equals(managerEq.title))
			return false;
		return true;
	}

	/**
	 * Description: prints out Title
	 * @return string line (format)
	 * @version 1.0
	 */
	@Override
	public String toString() {
		return super.toString() +"Title: " + title + "\t\t||" ;
	}	
}