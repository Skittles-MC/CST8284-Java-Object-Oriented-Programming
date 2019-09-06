package lab3startercode;

import java.util.Date;



public abstract class Patient {

	protected String firstName = new String(); 
	protected String lastName = new String(); 
	 protected OurDate birthDate ;//= new OurDate();
//	protected OurDate birthDate= new OurDate();
	protected int healthCardNumber;	
	
public abstract void anyMethod();
	
	public Patient(String firstName, String lastName, OurDate birthDate, int healthCardNumber) {
		this.firstName = new String (firstName);
		this.lastName = new String (lastName);
		//this.birthDate = new OurDate ();
		//this.birthDate = new OurDate (birthDate);
		this.healthCardNumber = healthCardNumber;
		this.birthDate = birthDate;
		//this.dateOfBirth = new Date (dateOfBirth);
	}
	
	public Patient (Patient patient) {
		this.firstName = new String (patient.firstName);
		this.lastName = new String (patient.lastName);
		//this.birthDate = new OurDate(birthDate);
		this.healthCardNumber = patient.healthCardNumber;
	    }
	

	public String getFirstName() {
		return firstName;
	}
	
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public OurDate getBirthDate() {
		return birthDate;
	}

	private void setBirthDate(OurDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getHealthCardNumber() {
		return healthCardNumber;
	}

	private void setHealthCardNumber(int healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}

//	public String toString(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", healthCardNumber=" + healthCardNumber + "]";
	}
	

}
