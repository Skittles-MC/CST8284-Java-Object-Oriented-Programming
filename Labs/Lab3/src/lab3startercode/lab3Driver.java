package lab3startercode;

//import lab1startercode.Book;

public class lab3Driver {

	public static void main(String [] args) {
		
		//PART A
		//TODO:  DECLARE AND INSTANTIATE THREE SUBCLASS ARRAYS:  USE A MAX SIZE OF 5
		//ONE OF EmergencyPatient, ONE OF MaternityPatient, AND ONE OF .OutPatient
		
//		Patient[] Patients = new Patient[];
//		Patient[] = patientArray = new Patient[5];
//		Patient = new Patient[10];
		
		
		EmergencyPatient[] EP = new EmergencyPatient[5];
		MaternityPatient[] MP = new MaternityPatient[5];
		OutPatient[] OP = new OutPatient[5];
		//TODO:  ADD AT LEAST THREE ELEMENTS TO EACH OF THE THREEE ARRAYS
//		EP[0] = Test, lasname, 1990, 199990, ZxdSASD;
//		EP.add("Test, lasname, 1990, 199990, ZxdSASD");
		EP[0] = new EmergencyPatient ("asdasdasd", "omfg", new OurDate(2,12,2014), 1111, true);
		EP[1] = new EmergencyPatient ("Bob", "jajaj", new OurDate(2,12,2014), 1111, false);
		EP[2] = new EmergencyPatient ("Wallag", "common", new OurDate(2,12,2014), 1111, true);
		EP[3] = new EmergencyPatient ("Adam", "nig", new OurDate(2,12,2014), 1111, false);
		EP[4] = new EmergencyPatient ("Jose", "Lol", new OurDate(2,12,2014), 1111, true);
		

		
		System.out.println("LAB 3 PART A\n");
		
		//TODO:  PRINT OUT THE ELEMENTS OF THE ARRAYS - IMPLICITY INVOKE toString() 
		System.out.println("ARRAY OF EMERGENCY PATIENTS");
//		for ( EmergencyPatient EmergencyPatient : EP){
//			System.out.println(EmergencyPatient.super.toString());
//		}
	///	System.out.println(EP[0]);
		for ( EmergencyPatient EmergencyPatient : EP){
			System.out.println( EmergencyPatient);
			//toString
			//System.out.println(Book.toString());
		}
		//super.toString(
		
//		 System.out.println(test1);
//		 System.out.println(test23);
		System.out.println();
		
		System.out.println("ARRAY OF MATERNITY PATIENTS"); 
		MP[0] = new MaternityPatient ("asdasdasd", "omfg", new OurDate(2,12,2014), 1111, new OurDate(), true);
		MP[1] = new MaternityPatient ("Bob", "jajaj", new OurDate(2,12,2014), 1111,  new OurDate(), false);
		MP[2] = new MaternityPatient ("Wallag", "common", new OurDate(2,12,2014), 1111,new OurDate(), true);
		MP[3] = new MaternityPatient ("Adam", "nig", new OurDate(2,12,2014), 1111,new OurDate(), false);
		MP[4] = new MaternityPatient ("Jose", "Lol", new OurDate(2,12,2014), 1111,new OurDate(), true);
		System.out.println();
		for ( MaternityPatient MaternityPatient : MP){
			System.out.println( MaternityPatient);
		}
		System.out.println();
		System.out.println("ARRAY OF OUT PATIENTS"); 
		//String firstName, String lastName, int healthCardNumber, OurDate birthDate, double distanceFromClinic, boolean mobility
		OP[0] = new OutPatient ("FirstName", "LastName",999912 ,new OurDate(1,6,2011), 765, true);  
		OP[1] = new OutPatient ("Walllah", "pewpew",12341 ,new OurDate(2,12,2014), 256, false);  
		OP[2] = new OutPatient ("WHOA", "bewbs",65544 ,new OurDate(2,12,2014), 111, true);  
		OP[3] = new OutPatient ("FirstName", "teeeestomg",87653 ,new OurDate(2,12,2014), 99, false);  
		System.out.println();
		for ( OutPatient OutPatient : OP){
			System.out.println( OutPatient);
		}
		//TODO:  DELCARE AND INSTANTIATE AN ARRAY OF THE SUPERCLASS - USE A MAX SIZE OF 10 - CALL THE ARRAY patients
		System.out.println();
		 System.out.println("ARRAY OF PATIENTS"); 
		Patient[] patients = new Patient[10];
		OurDate today = new OurDate (2010, 2, 2);

		
		//TODO:  ADD A FEW PATIENT REFERENCES TO THE Patient ARRAY
		
		//PART B THIS CODE WILL BREAK AFTER MAKING Patient ABSTRACT
		
		
		//TODO:  ADDA  FEW SUBCLASS REFERENCES TO THE SUPERCLASS ARRAY  -MANY WAYS TO DO THIS
		//Patient[] Patients = new Patient[];
		//EP[0] = new EmergencyPatient ("asdasdasd", "omfg", new OurDate(2,12,2014), 1111, true);
	//	patients[1] = new MaternityPatient ("Jose", "Lol", new OurDate(2,12,2014), 1111,new OurDate(), true); 
		
		//TODO:  PRINT OUT THE ARRAY OF PATIENTS
		
		
		
		System.out.println();
		
		//PART B
		System.out.println("LAB 3 PART B\n");
		
		//TODO:  REPLACE ANY 'BROKEN' ELEMENTS IN HTE PATIENT ARRAY (FROM PART A)
		
		
		//TODO:  PRINT OUT THE ARRAY OF PATIENTS
		
		  System.out.println("ARRAY OF PATIENTS"); 
		patients[0] = new EmergencyPatient("Jose", "Lol", new OurDate(2,12,2014), 1111, true);
		patients[1]  = new MaternityPatient ("Bob", "jajaj", new OurDate(2,12,2014), 1111,  new OurDate(), false);
		patients[2] = new OutPatient ("FirstName", "LastName",999912 ,new OurDate(1,6,2011), 765, true); 
		patients[3]= new EmergencyPatient ("Wallag", "common", new OurDate(2,12,2014), 1111, true);
		patients[4] = new MaternityPatient ("Billlle", "Joe", new OurDate(2,12,2014), 1111,new OurDate(), true);
		patients[5] = new OutPatient ("WHOA", "bewbs",65544 ,new OurDate(2,12,2014), 111, true);  
		for ( Patient Patient : patients){
			System.out.println( Patient);
		}
		 
		 	
	}//END MAIN	
}//END CLASS LAB3DRIVER
