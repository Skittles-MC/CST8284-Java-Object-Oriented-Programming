package lab3startercode;

public class OutPatient extends Patient {

	
	private double distanceFromClinic;
	private boolean mobility;
	
	private OutPatient() {
		this("unknown", "unknown", -9, new OurDate(), -1, false);	
	}
	
	public OutPatient(double distanceFromClinic, boolean mobility) {
		this("unknown", "unknown", -9, new OurDate(), distanceFromClinic, mobility);	
	}

	public OutPatient(String firstName, String lastName, int healthCardNumber, OurDate birthDate, double distanceFromClinic, boolean mobility) {
		super(firstName,lastName ,birthDate, healthCardNumber);
		setDistanceFromClinic(distanceFromClinic);
		setMobility(mobility);
		
	}
	
	

	public double getDistanceFromClinic() {
		return distanceFromClinic;
	}
	
	private void setDistanceFromClinic(double distanceFromClinic) {
		this.distanceFromClinic = distanceFromClinic;
	}
	public boolean isMobility() {
		return mobility;
	}
	private void setMobility(boolean mobility) {
		this.mobility = mobility;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutPatient other = (OutPatient) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (Double.doubleToLongBits(distanceFromClinic) != Double.doubleToLongBits(other.distanceFromClinic))
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
		if (mobility != other.mobility)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " distanceFromClinic: " + distanceFromClinic + ", mobility: " + mobility;
	}

	@Override
	public void anyMethod() {
		// TODO Auto-generated method stub
		
	}	
}
