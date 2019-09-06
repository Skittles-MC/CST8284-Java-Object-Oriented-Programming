/**
 * File Name:       	Company.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	addEmployee(),currentNumberEmployees(),isMaximumEmployees(),getEmployees(),findSeniorEmployee() 
 * 						deleteEmployee(), findEmployee()
 * Special notes:		Removed all includes since prof doesn't want packages                       
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class Company {
	/* An Array hold Employee object */
	private ArrayList<Employee> eList;

	/**
	 * Maximum number of Employees, final 10 {@value }
	 */
	// private final int MAXNUMBEREMPLOYEE = 10;
	private int currentEmployee = 0;

	public void setCurrentEmployee(int currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public int getCurrentEmployee() {
		return this.currentEmployee;
	}

	/**
	 * Default constructor
	 */
	public Company() {
		eList = new ArrayList<Employee>();
	}

	public Employee addEmployee(String name, int employeeNumber, OurDate startDate, double salary, int employeeType)
			throws OutOfMemoryError {
		final int MANAGER = 1;
		final int STAFF = 2;
		final int TEMP = 3;
		Employee eNew;

		switch (employeeType) {

		case MANAGER:
			eNew = new Manager(name, employeeNumber, startDate, salary);
			break;
		case STAFF:
			eNew = new Staff(name, employeeNumber, startDate, salary);
			break;
		case TEMP:
			eNew = new Temp(name, employeeNumber, startDate, salary);
			break;
		default:
			eNew = null;
			break;
		}
		if (null == eNew) {
			/* left here just for debug purpose */
			System.out.println("Wrong Input Can not process");
		}

		if (!isMaxmiumEmployees() && null != eNew) {
			/* make sure not duplicate */
			for (Employee e1 : eList) {
				if (e1.equals(eNew))
					return null;
			}
			eList.add(eNew);
		}

		return eNew;

	}


	public int currentNumberEmployees() {

		return eList.size();
	}


	public boolean isMaxmiumEmployees() throws OutOfMemoryError {
		/*
		 * Check the avaliable memory to see if there is enought memory to save a new
		 * employee
		 * 
		 */
		boolean maxReached = false;

		long heapFreeSize = Runtime.getRuntime().freeMemory();
		System.out.println(heapFreeSize);
		if (heapFreeSize <= 128) {
			maxReached = true;
			throw new OutOfMemoryError("No Memory Error to save the a new Employee!!");
		}

		return maxReached;
	}

	public Employee addEmployee(Employee e) {
		eList.add(e);
		setCurrentEmployee(currentEmployee++);
		return e;
	}

	public Employee findEmployee(int empNum) {
		/*
		 * if find employee based on the empNumb , return null if not founded
		 * 
		 */
		Employee e = null;
		int employeeNumber = 0;

		for (Employee el : eList) {

			if (el.getEmployeeNumber() == empNum) {
				e = el;
				this.currentEmployee = employeeNumber;
				// break to exit loop: only try find the first match
				break;
			}
			employeeNumber++;
		}
		return e;
	}

	public Employee findEmployeeByNumber(int currentNumber) {
		/*
		 * if find employee based on the empNumb , return null if not founded
		 * 
		 */
		Employee e = null;
		
		if (currentNumber >= 0 && currentNumber < eList.size())
			e =  eList.get(currentNumber);
		return e;
	}

	public Employee deleteEmployee(int empNum) {
		/*
		 * not found employee number return null
		 * 
		 */
		Employee e = null;
		int employeeNumber = 0;

		for (Employee el : eList) {

			if (el.getEmployeeNumber() == empNum) {
				eList.remove(el);
				this.currentEmployee = employeeNumber;
				e = el;
				// break to exit loop: only delete the first founded
				break;
			}
			employeeNumber++;
		}
		return e;

	}

	public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> eReturnList = new ArrayList<Employee>();
		for (Employee e : eList) {
			eReturnList.add(e);
		}
		return eReturnList;
	}


	public ArrayList<Employee> findSeniorEmployee() {
		final int YEAR_BEFORE_2008 = 2008;
		ArrayList<Employee> seniorList = new ArrayList<Employee>();

		for (Employee e : eList) {
			if (e.getStartDate().getYear() <= YEAR_BEFORE_2008) {
				seniorList.add(e);
			}
		}

		return seniorList;
	}

	/**
	 * serialize the Employee inside the database to a file
	 */
	public void saveEmployeesToFile() {

		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		// get the employee list
		ArrayList<Employee> writeList = this.getEmployees();
		file = new File("CurrentEmployees.emp");
		// not exist create it
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fos = new FileOutputStream(file);
			out = new ObjectOutputStream(fos);
			for (Employee e : writeList)
				out.writeObject(e);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				out.close();
				this.setCurrentEmployee(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	/**
	 * De-serialize the Employee from a file
	 */
	public void loadEmployeesFromFile() {
		File file = new File("CurrentEmployees.emp");
		FileInputStream fis = null;
		ObjectInputStream in = null;
		Employee employee = null;
		ArrayList<Employee> readList = new ArrayList<>();

		try {
			fis = new FileInputStream(file);
			in = new ObjectInputStream(fis);

			while ((employee = (Employee) in.readObject()) != null) {
				readList.add(employee);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			for (Employee em : readList)
				System.out.println(em);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				in.close();
				this.setCurrentEmployee(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public Employee findCurrentEmployee() {
		if (eList.get(currentEmployee) != null)
			return eList.get(currentEmployee);
		else
			return null;

	}

	public Employee getPrivousEmployee() {
		/*
		 * validate currentEmployee first
		 */
		if (currentEmployee >= 0 && currentEmployee < eList.size()) {
			/* for last one current always p to last */
			if (currentEmployee == 0) {
				currentEmployee = 0;
				return eList.get(currentEmployee);
			} else
				return eList.get(--currentEmployee);
		}
		return null;

	}

	public Employee getNextEmployee() {
		/*
		 * validate currentEmployee first
		 */
		System.out.println(currentEmployee);
		if (currentEmployee >= 0 && currentEmployee < eList.size()) {
			/* for last one current always p to last */
			if (currentEmployee == (eList.size() - 1)) {
				currentEmployee = eList.size() - 1;
				return eList.get(currentEmployee);
			} else
				return eList.get(++currentEmployee);
		}

		// default return null
		return null;

	}

}