/**
 * Class Company: abstracts a company
 * @author Carolyn MacIsaac, with modifications by Dave Houtman
 * CST8284
 * Assignment 1: Company Management Tool prototype
 * February 11 2019
 */
package company;
import java.util.ArrayList;
import java.util.Calendar;

public class Company {

	// an array to hold the employees of the company
//	private Employee[] employees;
	
	private ArrayList<Employee> employees;
	
	// the maximum size of the employees array
	private static final int MAXNUMEMPLOYEES = 10;
	
	
	
	// used as an index to the next location in the employees array
	// to be loaded with a new Employee object
	private static int numberEmployees = 0;

	// default constructor; it instantiates the Employee array and pre-loads
	// three employees, to be used for demonstration purposes
	public Company() {
		employees = new Employee[MAXNUMEMPLOYEES];

		addEmployee("Alvin Spring", 14, new OurDate(2, 12, 2014), 150000);
		addEmployee("Grant Barge", 21, new OurDate(18, 5, 2009), 40000);
		addEmployee("Ross Chuttle", 23, new OurDate(22, 2, 2010), 43269);
	}

	// a getter; it returns the current number of Employees loaded in the employee
	// array
	public int currentNumberEmployees() {
		//return numberEmployees;
		return employees.size();
	}

	// returns a true value if the number of non-null Employees loaded in the
	// employees array is equal to or greater than the array size
	public boolean isMaximumEmployees() {
		return (numberEmployees >= MAXNUMEMPLOYEES);
	}

	// return a reference to the array of Employees
	public Employee[] getEmployees() {
		//return employees;
		
		//change this after
		Employee[] employeeList = new Employee[employeess.]
				employees.toArray(employeeList);
				return employeeList;
	}
	
	// Find senior employee by converting the start date of each non-null employee
	// in the employees array to its Calendar equivalent, and using Calendar's 
	// before() method to determine which date is earliest.  The index of the
	// earliest start date is used to return a new instance of the most senior
	// employee
	
	public Employee findSeniorEmployee() {
		
		if (numberEmployees==0) return null;  // return null if no employees entered
		
		int seniorEmployeeIndex = 0; //assume first employee in array is senior
		// instantiate Calendar objects for current and earliest start dates
		Calendar calEarliestStartDate = (Calendar.getInstance());  
		
		// load Calendar object to hold presumed earliest start date using employees[0]
		OurDate odEarliestStartDate = employees[seniorEmployeeIndex].getStartDate();
		calEarliestStartDate.set(odEarliestStartDate.getYear(), 
				odEarliestStartDate.getMonth(), odEarliestStartDate.getDay());

		// loop through remaining employees and compare to determine earliest start date
		for (int employeeIndex = 1;  employeeIndex < numberEmployees; employeeIndex++) {
		     OurDate thisStartDate = employees[employeeIndex].getStartDate();
		     Calendar calThisStartDate = Calendar.getInstance();  // need to load new instance..
		     calThisStartDate.set(thisStartDate.getYear(),   
						thisStartDate.getMonth(), thisStartDate.getDay());
		     // Use calendar before() method to compare Calendar start dates
		     if (calThisStartDate.before(calEarliestStartDate)){
		    	 seniorEmployeeIndex = employeeIndex;  // set new oldest employee
		    	 calEarliestStartDate = calThisStartDate;
		     }
		}
		return employees[seniorEmployeeIndex];  // return employee at index with earliest startdate
	}
	
	
	//find employee method
	
	
	//delete employee
	
	Employee foundEmployee = this.findEmployee(employee)
			if(foundEMployee != null) {
				employee.remove(foundEMployee);
				
			}
	return foundEmployee;
	
/*	// An alternate implementation of findSeniorEmployee().  It lacks some of the 
	// sophistication of the above method, but it works reliably
	 
	public Employee findSeniorEmployee() {
		
		if (numberEmployees==0) return null;  // return null if no employees entered
		
		int seniorEmployeeIndex = 0, thisStartDateHash = 0; 
		
		// assume employees[0] is the senior employee and create a hash value 
		// combining the year, month and day
		OurDate oldestStartDate = employees[seniorEmployeeIndex].getStartDate(), thisStartDate;
		int oldestStartDateHash = oldestStartDate.getYear()*10000 +
				oldestStartDate.getMonth()*100 + oldestStartDate.getDay();

		// loop through remaining employees and compare each employee's StartDate 
		// to the current oldest
		for (int employeeIndex = 1;  employeeIndex < numberEmployees; employeeIndex++) {
		     thisStartDate = employees[employeeIndex].getStartDate();
		     thisStartDateHash = thisStartDate.getYear()*10000 +
						thisStartDate.getMonth()*100 + thisStartDate.getDay(); 
		     // compare the two hash values
		     if (thisStartDateHash < oldestStartDateHash){ // if new date was earlier...
		    	 seniorEmployeeIndex = employeeIndex;  // set new oldest employee
		    	 oldestStartDateHash = thisStartDateHash;
		     }
		}
		return employees[seniorEmployeeIndex];  // return employee at index with earliest startdate
	}
*/

	// assuming there is still room in the employees array, this method
	// adds an employee at the location currently pointed to by the 
	// numberEmployees value, which acts as an index to the employees array
	public void addEmployee(String name, int employeeNumber, OurDate date, double salary) {
		if (!isMaximumEmployees())
		     employees[numberEmployees++] = new Employee(name, employeeNumber, date, salary);
		else 
			System.out.println("Attempt to exceed maximum Employee array size");
	}
	//noo neeed to load extra info
	//leave this method for void
	switch(empType) {
	case MANAGER:
		employees.add(new Manager (name, employeeNumber, date, salary , "" )) //default value
		break;
		//for the rest
		//temp has null instead of "" 
	}
	

}// end class 



//public Manager)
// super();
//call that loadextra info 

public Manager (string name, int employee etc)
super(name, employeenumber, startDate, salary)
if(title.equals(""))
	this.loadExtraInfo();
else
	setTitle(title);


//loadExtraInfo
//scanner input = new scanner (system)
//print ENTER MANGERS TITLE:
//	this.setTitle(input.next())
