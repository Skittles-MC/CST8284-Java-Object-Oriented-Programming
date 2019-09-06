package company;
import java.util.Calendar;  // Note: OurDate wraps Calendar

/**
 * Class OurDate: a wrapper for the Calendar class
 * @author Carolyn MacIsaac
 * CST8284 
 * Assignment 1: Company Management Tool prototype
 * February 11 2019
 */

public class OurDate {

	// private fields for day, month, year
	private int day;
	private int month;
	private int year;
	
	// each OurDate object wraps a Calendar object; Calendar's functionality can then
	// be used for initialization, comparison, etc.
	private static final Calendar CALENDAR = Calendar.getInstance();
  
    // initialization of OurDate default constructor uses today's day, month, 
	// and year, as returned by the Calendar object's methods.  (See, for example,
	// https://www.geeksforgeeks.org/calendar-class-in-java-with-examples/)
	// This constructor is chained to the (int day, int month, int year) constructor below.  
	// Note that the months are 1-based, not 0-based.  Hence January = 1, 
	// February = 2, etc. 
    public OurDate() { this(CALENDAR.get(Calendar.DATE), 
		   CALENDAR.get(Calendar.MONTH + 1), 
		   CALENDAR.get(Calendar.YEAR) ); }
	
    // base constructor.  Note input format: day, month, year, NOT year, month, day
    // as used in Calendar constructor
	public OurDate(int day, int month, int year) {	
		setDay(day);
		setMonth(month);
		setYear(year);	
	}
	
	// private setter for day of month
	private void setDay(int day) {  this.day = day;  }
	
	// private setter for month
	private void setMonth(int month) {  this.month = month;  }
	
	// private setter for year
	private void setYear(int year) {  this.year = year;  }
	
	// returns the day of the month
	public int getDay() {  return day; }
	
	// returns the month as an int, where January = 1, February = 2, etc.
	public int getMonth() {  return month; }
	
	// returns the year
	public int getYear() {  return year;  }

	// prints date to console in day/month/year format
	@Override
	public String toString() {  return this.day +"/" +this.month + "/" + this.year; }

	// compares two OurDate objects for equality
	@Override
	public boolean equals(Object obj) {

		if ((obj == null) || (this.getClass() != obj.getClass())) return false;
		OurDate other = (OurDate) obj;
	    return (this.getDay() == other.getDay() && 
	    		this.getMonth() == other.getMonth() && 
	    		this.getYear() == other.getYear() ) ; 
			
	}//END EQUALS METHOD 
	
}//END CLASS EMPLOYEE
