

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar; // Note: OurDate wraps Calendar

/**
 * Class OurDate: a wrapper for the Calendar class
 * 
 * @author Carolyn MacIsaac with modifications by Dave Houtman for Lab 6
 */

public class OurDate {

	// private fields for day, month, year
	private int day, month, year;

	// each OurDate object wraps a Calendar object; Calendar's functionality can
	// then
	// be used for initialization, comparison, etc.
	private static final Calendar CALENDAR = Calendar.getInstance();

	// initialization of OurDate default constructor uses today's day, month,
	// and year, as returned by the Calendar object's methods. (See, for example,
	// https://www.geeksforgeeks.org/calendar-class-in-java-with-examples/)
	// This constructor is chained to the (int day, int month, int year) constructor
	// below.
	// Note that the months are 1-based, not 0-based. Hence January = 1,
	// February = 2, etc.
	public OurDate() {
		this(CALENDAR.get(Calendar.DATE), CALENDAR.get(Calendar.MONTH + 1), CALENDAR.get(Calendar.YEAR));
	}
	
	public OurDate(String startDate) {
		setOurDate(startDate);
	}

	// base constructor. Note input format: day, month, year, NOT year, month, day
	// as used in Calendar constructor
	public OurDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	// private setter for day of month
	private void setDay(int day) {
		this.day = day;
	}

	// private setter for month
	private void setMonth(int month) {
		this.month = month;
	}

	// private setter for year
	private void setYear(int year) {
		this.year = year;
	}

	// returns the day of the month
	public int getDay() {
		return day;
	}

	// returns the month as an int, where January = 1, February = 2, etc.
	public int getMonth() {
		return month;
	}

	// returns the year
	public int getYear() {
		return year;
	}

	// prints date to console in day/month/year format
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean setOurDate(String s) throws BadAccountInputException {
		boolean result = true;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		// TODO #4: Catch the following four exceptions, and rethrow BadAccountInputException
		// in each catch block, along with the message indicated.
	    // RuntimeException: "General runtime exception thrown setting start date"
		// IllegalArgumentException: "Bad data type passed to an internal method"
		// NumberFormatException: "Bad input value; date " + s + " contains non-numeric value"
		// ParseException: "Date " + s + " not possible"		
		try {
			String[] dmy = s.split("/");
			setYear(Integer.parseInt(dmy[2]));
			setMonth(Integer.parseInt(dmy[1]));
			setDay(Integer.parseInt(dmy[0]));
			CALENDAR.setTime(dateFormat.parse(s));  // use calendar to check for impossible dates
			return result;
			
		} catch (NumberFormatException g) {
			throw new BadAccountInputException("Bad input value; date " + s + " contains non-numeric value");
		} catch (IllegalArgumentException f) {
			throw new BadAccountInputException("Bad data type passed to an internal method");
		}  catch (ParseException h) {
			throw new BadAccountInputException("Date " + s + " not possible");
		} catch (RuntimeException e) {
			throw new BadAccountInputException("General Runtime exception thrown setting start date");
}
}

	// compares two OurDate objects for equality
	@Override
	public boolean equals(Object obj) {

		if ((obj == null) || (this.getClass() != obj.getClass()))
			return false;
		OurDate other = (OurDate) obj;
		return (this.getDay() == other.getDay() && this.getMonth() == other.getMonth()
				&& this.getYear() == other.getYear());

	}// END EQUALS METHOD

}// END CLASS EMPLOYEE
