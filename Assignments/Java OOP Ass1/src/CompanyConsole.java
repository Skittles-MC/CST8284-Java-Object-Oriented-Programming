
/**
 * File Name:       	CompanyConsole.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	1
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE
 * Due Date:        	Monday, Feb 11 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	main(),menu(),addEmployee(),displayEmployees(),displaySeniorEmployee()                  
 * Special notes:		Removed all includes since prof doesn't want packages       
 */
import java.util.Scanner;

/**
 * This class is responsible for interactions with the user. Has all the print
 * statements
 * 
 * @author Martin Choy
 * @version 1
 */
public class CompanyConsole {
	/**
	 * Data members/variables
	 */
	private final static int ADDEMPLOYEE = 1;
	private final static int DISPLAYEMPLOYEES = 2;
	private final static int DISPLAYSENIOREMPLOYEE = 3;
	private final static int EXIT = 9;
	private Company startUp;
	Scanner input = new Scanner(System.in);

	public CompanyConsole() {
	}

	/**
	 * Main; Starts and runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CompanyConsole run = new CompanyConsole();
		run.startUp = new Company();
		run.menu();
	}

	/**
	 * Menu is a menu. Includes error trapping with the switch case statements. Will break
	 * if user enters in any string value. I did not place a throws exception 
	 */
	public void menu() {
		int seletion;
		do {
			System.out.println("*********************************************");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY EMPLOYEES");
			System.out.println("3. DISPLAY SENIOR EMPLOYEE");
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
	 * Adds employees. Has basic error trapping
	 */
	private void addEmployee() {
		String EmployeeNameTemp;
		int day, month, year, employeeNumberTemp;
		double salary;

		//will make it so wont skip name input line
		input.nextLine();
		System.out.println("Enter new Employee Information:");
		System.out.println("Name: ");
		EmployeeNameTemp = input.nextLine();
		System.out.println("Employee's number: ");
		employeeNumberTemp = input.nextInt();
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

		startUp.addEmployee(EmployeeNameTemp, employeeNumberTemp, new OurDate(day, month, year), salary);
	}

	/**
	 * Displays all the employees currently in array
	 */
	private void displayEmployees() {
		System.out.println();
		System.out.printf("||%-17s||%-17s||%-17s||%-17s||%n", "NAME", "EMPLOYEE NO.", "START DATE", "SALARY");
		for (int i = 0; i < startUp.currentNumberEmployees(); i++) {
			System.out.print(startUp.getEmployees()[i]);
		}
	}

	/**
	 * Calls other method in Company and locates oldest employee. And displays
	 * the employee
	 */
	private void displaySeniorEmployee() {
		System.out.println();
		System.out.printf("||%-17s||%-17s||%-17s||%-17s||%n", "NAME", "EMPLOYEE NO.", "START DATE", "SALARY");
		System.out.println(startUp.findSeniorEmployee());
	}
}