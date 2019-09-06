package lab3startercode;

public class MaternityPatient  extends Patient{


	private OurDate dueDate;
	private boolean nutritionTesting;
	public MaternityPatient() {
		
		this("unknown", "unknown", new OurDate(), -9,  new OurDate(), false);	
	}
	
	public MaternityPatient(String firstName, String lastName, OurDate birthDate, int healthCardNumber, OurDate dueDate, boolean nutritionTesting) {
		super(firstName,lastName ,birthDate, healthCardNumber);
		setDueDate(dueDate);
		setNutritionTesting(nutritionTesting);
		
	}
	
	

	public OurDate getDueDate() {
		return dueDate;
	}
	private void setDueDate(OurDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isNutritionTesting() {
		return nutritionTesting;
	}
	private void setNutritionTesting(boolean nutritionTesting) {
		this.nutritionTesting = nutritionTesting;
	}

	@Override
	public String toString() {
		return super.toString() + "MaternityPatient [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", healthCardNumber=" + healthCardNumber +"MaternityPatient " +", dueDate=" + dueDate + ", nutritionTesting="
				+ nutritionTesting + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		MaternityPatient other = (MaternityPatient) obj;
		
		
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (healthCardNumber != other.healthCardNumber)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (nutritionTesting != other.nutritionTesting)
			return false;
		return true;
	}

	@Override
	public void anyMethod() {
		// TODO Auto-generated method stub
		
	}	
}//END CLASS MATERNITYPATIENT
