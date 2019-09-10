
/**
 * File Name:       	CompanyConsole.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	3
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.3
 * Due Date:        	Sunday, April 14 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	main(),menu(),addEmployee(),displayEmployees(),displaySeniorEmployee()     
 * 						deleteEmployee(), findEmployee()   
 * Special notes:		Removed all includes since prof doesn't want packages                 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description: This class is responsible for interactions with the user. Has most of the
 * 				print statements
 * 
 * @author Martin Choy
 * @version 1.3
 * Notes: Added in two more additional options
 */
public class CompanyConsole {
	/**
	 * Data members/variables
	 */
	private final static int ADDEMPLOYEE = 1;
	private final static int DISPLAYEMPLOYEES = 2;
	private final static int DISPLAYSENIOREMPLOYEE = 3;
	private final static int FINDEMPLOYEE = 4;
	private final static int DELETEEMPLOYEE = 5;
	
	private final static int SAVEEMPLOYEESTOFILE = 6;
	private final static int LOADEMPLOYEESFROMFILE = 7;
	
	private final static int EXIT = 9;
	public final static int MANAGER = 1;
	public final static int STAFF = 2;
	public final static int TEMP = 3;

	private Company startUp;
	Scanner input = new Scanner(System.in);

	public CompanyConsole() {
	}

	/**
	 * Main; Starts and runs the program
	 * 
	 * @param args - defualts
	 */
	public static void main(String[] args) {
		CompanyConsole run = new CompanyConsole();
		run.startUp = new Company();
		run.menu();
	}

	/**
	 * Description: Menu is a menu. Includes error trapping with the switch case
	 * statements. Will break if user enters in any string value. I did not
	 * place a throws exception for strings
	 * 
	 * @version 1.3 
	 * Notes: Added in new options to reflect the new methods
	 */
	public void menu() {
		int seletion;
		do {
			System.out.println("*********************************************");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY EMPLOYEES");
			System.out.println("3. DISPLAY SENIOR EMPLOYEE");
			System.out.println("4. FIND EMPLOYEE");
			System.out.println("5. DELETE EMPLOYEE");
			
			System.out.println("6. SAVE EMPLOYEES TO FILE");
			System.out.println("7. LOAD EMPLOYEES FROM FILE");
			
			System.out.println("9. EXIT");
			System.out.println("*********************************************");
			System.out.println();
			System.out.print("Selection: ");
			seletion = input.nextInt();
			switch (seletion) {
			case ADDEMPLOYEE:
				addEmployee();
				break;
			case DISPLAYEMPLOYEES:
				displayEmployees();
				break;
			case DISPLAYSENIOREMPLOYEE:
				displaySeniorEmployee();
				break;
			case FINDEMPLOYEE:
				findEmployee();
				break;
			case DELETEEMPLOYEE:
				deleteEmployee();
				break;
				
			case SAVEEMPLOYEESTOFILE:
				startUp.saveEmployeeToFile();
				break;
				
			case LOADEMPLOYEESFROMFILE:
				startUp.loadEmployeeFromFile();
				break;
			case EXIT:
				System.out.println("Good bye!");
				break;
			default:
				System.out.println("Wrong choice. Please choose one of valid the menu options");
			}
			System.out.println();
		} while (seletion != EXIT);
	}

	/**
	 * Description: Adds employees. Has basic error trapping
	 * 
	 * @version 1.2 
	 * Notes: Added in new types field and verification for
	 *        employee number addition. Checks for number already in arraylist
	 */
	private void addEmployee() {
		String EmployeeNameTemp;
		int day, month, year;
		double salary;
		// will make it so wont skip name input line
		input.nextLine();
		System.out.println("Enter new Employee Information:");
		System.out.println("Name: ");
		EmployeeNameTemp = input.nextLine();
		System.out.println("Employee's number: ");

		ArrayList<Employee> employeeNumber = startUp.getEmployees();
		int employeeNumberTemp = 0;
		boolean employeeNumberCompare;

		do {
			if (input.hasNextInt()) {
				employeeNumberTemp = input.nextInt();
				employeeNumberCompare = true;
			} else {
				System.out.print("Invalid input: please select employee # 1-10");
				System.out.print("\nEmployee's number: ");
				employeeNumberCompare = false;
				input.next();
			}
		} while (!(employeeNumberCompare));

		for (int i = 0; i < startUp.currentNumberEmployees(); i++) {
			while (employeeNumberTemp == employeeNumber.get(i).getEmployeeNumber()) {
				System.out.println("Employee # " + employeeNumberTemp
						+ " already exist: please assign another employee #\nEmployee's number: ");
				employeeNumberTemp = input.nextInt();
			}
		}
		System.out.println("Hiring Date");
		System.out.print("Year: ");
		year = input.nextInt();
		System.out.print("Month: ");
		month = input.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("Invalid value. Enter value from 1 to 12.");
			System.out.print("Month: ");
			month = input.nextInt();
		}

		System.out.print("Day: ");
		day = input.nextInt();
		// assumes days out of the months are 31 out of 31. Doesn't handle
		// special months or year years
		while (day < 1 || day > 31) {
			System.out.printf("Invalid value. Enter again from 1 to 31\n");
			System.out.print("Day: ");
			day = input.nextInt();
		}
		System.out.println("Salary:");
		salary = input.nextDouble();
		System.out.println("Employee Type Manager = 1, Staff = 2, Temp = 3");
		int type = input.nextInt();

		startUp.addEmployee(EmployeeNameTemp, employeeNumberTemp, new OurDate(day, month, year), salary, type);
	}

	/**
	 * Description: Displays all the employees currently in array
	 * 
	 * @version 1.2 
	 * Notes: Modified to work with arraylist of type Employee
	 */
	private void displayEmployees() {
				if(startUp.getEmployees().size() == 0){
					System.out.println("There are no employees\n");
		}
				else{
					
				
		System.out.println();
		System.out.printf("||%-17s||%-17s||%-17s||%-17s||%s \t||%n", "NAME", "EMPLOYEE NO.", "START DATE", "SALARY",
				"EMPLOYEE INFO\t");
		for (int i = 0; i < startUp.currentNumberEmployees(); i++) {
			System.out.println(startUp.getEmployees().get(i));
		}}
	}

	/**
	 * Description: Calls other method in Company and locates oldest employee.
	 * And displays the employee
	 * 
	 * @version 1.2 
	 * Notes: Modified to work with arraylist of type Employee
	 */
	private void displaySeniorEmployee() {
		if(startUp.getEmployees().size() == 0){
			System.out.println("There are no employees\n");
}
		
		else{
		System.out.println();
		System.out.printf("||%-17s||%-17s||%-17s||%-17s||%s \t||%n", "NAME", "EMPLOYEE NO.", "START DATE", "SALARY",
				"EMPLOYEE INFO\t");
		System.out.println(startUp.findSeniorEmployee());
		}
	}

	/**
	 * Description: Method used to delete employees in the arraylist
	 * 
	 * @version 1.2 
	 * Notes: Has error trapping similar to the findEmployee()
	 *          method to check if that specified employee number does exist in
	 *          the array. If not send user back to menu and if true delete.
	 */
	private void deleteEmployee() {
		System.out.println("Enter number of employee to delete: ");
		int deleteEmployee = input.nextInt();
		Employee testDelete = startUp.findEmployee(deleteEmployee);
		if (testDelete != null) {
			System.out.println("Found employee!");
			System.out.println("The record for " + startUp.findEmployee(deleteEmployee).getName()
					+ " , employee number, " + deleteEmployee + " has been deleted");
			startUp.deleteEmployee(deleteEmployee);
		} else
			System.out.println("An employee with that number could not be found!");
		System.out.println("Back to the main menu.");
	}

	/**
	 * Description: Method used to find employee
	 * 
	 * @version 1.2 
	 * Notes: Has error trapping to check if that specified
	 *          employee number does exist in the array. If not send user back
	 *          to menu and if true display employee.
	 */
	private void findEmployee() {
		System.out.println("Enter employee number to find: ");
		int findEmployee = input.nextInt();
		Employee employeeFinding = startUp.findEmployee(findEmployee);
		if (employeeFinding != null) {
			System.out.println("Found employee!");
			System.out.printf("||%-17s||%-17s||%-17s||%-17s||%s \t||%n", "NAME", "EMPLOYEE NO.", "START DATE", "SALARY",
					"EMPLOYEE INFO\t");
			System.out.println(employeeFinding);
		} else
			System.out.println("An employee with that number could not be found");
		System.out.println("Back to the main menu.");
	}
}