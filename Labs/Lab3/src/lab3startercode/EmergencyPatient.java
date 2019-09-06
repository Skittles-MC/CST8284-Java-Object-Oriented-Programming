package lab3startercode;

public class EmergencyPatient extends Patient {


	private boolean hasIdentification;//default false
		
	public EmergencyPatient(){
			this("unknown", "unknown", new OurDate(), -9, false);	
		}
	
	public EmergencyPatient(String firstName, String lastName, OurDate birthDate, int healthCardNumber, boolean hasID){
			
		super(firstName,lastName ,birthDate, healthCardNumber);
			setHasIdentification(hasID);
		}
		
	public boolean isHasIdentification() {
			return hasIdentification;
		}

	private void setHasIdentification(boolean hasIdentification) {
			this.hasIdentification = hasIdentification;
		}


	@Override
	public String toString() {
		return super.toString() + "EmergencyPatient [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", healthCardNumber=" + healthCardNumber + ",EmergencyPatient  " + ", hasIdentification=" + hasIdentification + "]";
	}

	@Override
	public void anyMethod() {
		// TODO Auto-generated method stub
		
	}
	
}//END CLASS EMERGENCYPATIENT