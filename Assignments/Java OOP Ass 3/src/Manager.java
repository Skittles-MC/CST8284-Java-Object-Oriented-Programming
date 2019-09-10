
/**
 * File Name:       	Manager.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	3
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, April 14 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getTitle(),setTiltle(),loadExtraInfo(),equals(),toString()    
 * Special notes:		Removed all includes since prof doesn't want packages                
 */
import java.util.Scanner;
import java.io.Serializable;
/**
 * Subclass of employees, different type of employee
 * 
 * @author Martin Choy
 * @version 1
 */
public class Manager extends Employee implements Serializable {
	private String title;
	public static final long serialVersionUID = 1L;
	/**
	 * Default constructor
	 */
	public Manager() {
		this("PlaceHolder", 1, new OurDate(), 1.0,"Test");
	}

	/**
	 * Description: Parameterized constructor
	 * @param name - Employee name
	 * @param employeeNumber - Employee number
	 * @param startDate - Employee Start date
	 * @param salary - Employee Salary
	 * @param title - Employee title
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
	 * @param title - Managers title
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
	 * @return true
	 * @return false
	 * @param obj - Employee object
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
	 * @return super.toString
	 * @version 1.0
	 */
	@Override
	public String toString() {
		return super.toString() +"Title: " + title + "\t\t||" ;
	}	
}