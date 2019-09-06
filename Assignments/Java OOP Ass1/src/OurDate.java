
/**
 * File Name:       	OurDate.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	1
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE
 * Due Date:        	Monday, Feb 11 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getDay(),getMonth(),getYear(),setDay(),setMonth(),setYear(),toString(),isEqual()                   
 * Special notes:		Removed all includes since prof doesn't want packages    
 */
import java.util.Calendar;

/**
 * Sets and keeps track of dates for employees within the company
 * 
 * @author Martin Choy
 * @version 1
 */
public class OurDate {

	/**
	 * Data members/variables
	 */
	private static final Calendar CALENDAR = Calendar.getInstance();
	private int day;
	private int month;
	private int year;

	/**
	 * Creates an instance of the OurDate class with specified attributes
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public OurDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	/**
	 * Default constructor
	 */
	public OurDate() {
		// This segment of code was showed in lecture/lab
		this(CALENDAR.get(Calendar.DATE), CALENDAR.get(Calendar.MONTH) + 1, CALENDAR.get(Calendar.YEAR));
	}

	/**
	 * Get the day value
	 * 
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Get the month value
	 * 
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Get the year value
	 * 
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the value of day
	 * 
	 * @param day
	 */
	private void setDay(int day) {
		this.day = day;
	}

	/**
	 * Sets the value of month
	 * 
	 * @param month
	 */
	private void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Sets the value of year
	 * 
	 * @param year
	 */
	private void setYear(int year) {
		this.year = year;
	}

	/**
	 * Returns a string representation of the object, e.g., 12/8/1999.
	 * 
	 * @return dd/mm/yyyy
	 */
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	/**
	 * Returns true if the object is equal to the date otherDate.
	 * 
	 * @param obj
	 * @return true or false
	 */
	public boolean isEqual(Object obj) {
		OurDate date = (OurDate) obj;
		return (day == date.day) && (month == date.month) && (year == date.year);
	}
}
