/**
 * File Name:       	OurDate.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getDay(),getMonth(),getYear(),setDay(),setMonth(),setYear(),toString(),isEqual()                   
 * Special notes:		Didn't really touch at all...since assignment one.  
 * Special notes:		Removed all includes since prof doesn't want packages  
 */

import java.io.Serializable;
import java.text.ParseException;
import java.util.*;



public class OurDate implements Serializable {
	/**
	 * @serial
	 */
	private static final long serialVersionUID = 1L;

	private final static Calendar CALENDAR = Calendar.getInstance();
	private int day;
	private int month;
	private int year;

	/**
	 * Default constructor 
	 */
	public OurDate() {
		this(CALENDAR.get(Calendar.DATE), CALENDAR.get(Calendar.MONTH), CALENDAR.get(Calendar.YEAR));
	}


	/**
	 * Overloaded constructor take 3 parameters for Staff
	 * @param day Day
	 * @param month Month
	 * @param year Year
	 */
	public OurDate(int day, int month, int year) {

		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	public OurDate(Date date) throws ParseException {
//		if(date.getDate() <= 0 || date.getDate() >31)
//			throw new ParseException("Day Error",1);
//		if(date.getMonth()< 0 || date.getMonth() >12)
//			throw new ParseException("Month  Error",2);
//		if(date.getYear() < 0 || date.getYear() > 119 )
//			throw new ParseException("Year  Error",3);
		this.setDay(date.getDate());
		this.setMonth(date.getMonth()+1);
		this.setYear(date.getYear()+1900);
	}
	/**
	 * Getter : get day
	 * @return day
	 */
	public int getDay() {
		return this.day;
	}
	/**
	 * Setter : set day
	 * @param day
	 */
	private void setDay(int day) {
		this.day = day;
	}

	/**
	 * Getter : get day
	 * @return month
	 */
	public int getMonth() {
		return this.month;
	}

	/*
	 * Private: Method: set the Month
	 */
	/**
	 * Setter : set month
	 * @param month
	 */
	private void setMonth(int month) {
		this.month = month;
	}


	/**
	 * Getter : get Year
	 * @return  year
	 */
	public int getYear() {
		return this.year;
	}
	/**
	 *  Setter : set year
	 * @param year
	 */
	private void setYear(int year) {
		this.year = year;
	}

	/*
	 * Method : override toString return: String
	 */
	@Override

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	/*
	 * Method : override equals return : boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof OurDate)) {
			return false;
		}
		OurDate o = (OurDate) obj;
		return this.getDay() == o.getDay() && this.getMonth() == o.getMonth() && this.getYear() == o.getYear();

	}

}