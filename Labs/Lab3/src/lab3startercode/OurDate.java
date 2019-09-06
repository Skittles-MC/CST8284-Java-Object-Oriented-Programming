package lab3startercode;

import java.util.Calendar;
import java.util.Date;

public class OurDate {

	private static final Calendar CALANDAR = Calendar.getInstance();
	private int day;
	private int month;
	private int year;
	//private OurDate birthDate;
	
	public OurDate() {//default set to current date
		this( CALANDAR.get( Calendar.DATE),
				CALANDAR.get( Calendar.MONTH),
				CALANDAR.get( Calendar.YEAR));
	}
	
	public OurDate(int day, int month, int year) {
		
		setDay(day);
		setMonth(month);
		setYear(year);
	}

//	public OurDate(OurDate birthDate) {
		// TODO Auto-generated constructor stub
		//this.birthDate = new OurDate (null);
//	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public int getDay() {
		return day;
	}

	private void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	private void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		OurDate other = (OurDate) obj;
		
		  if( !(this.getDay() == other.getDay() && this.getMonth() == other.getMonth()
		  && this.getYear() == other.getYear())) return false;
		 
		
		/*
		 * if (day != other.day) return false; if (month != other.month) return false;
		 * if (year != other.year) return false;
		 */
		return true;
		
		/*
		 * return this.getDay() == other.getDay() && this.getMonth() == other.getMonth()
		 * && this.getYear() == other.getYear();
		 */
	}
	
	
}//END CLASS OURDATE
