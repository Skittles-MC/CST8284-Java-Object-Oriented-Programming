

public class Account {
	private double startingBalance = 0;  // cannot be negative or zero; throw error if negative
	private String accountNumber = "000-000000";  // cannot begin with 0, can be < 100000, must have branch number, must have correct check digit
	private String firstName, lastName;  // see below
	private OurDate accountOpenedDate; // use OurDate
	
	public Account() {}
	
	public OurDate getAccountOpenedDate() {
		return accountOpenedDate;
	}
	
	private void setAccountOpenedDate(OurDate od) {
		accountOpenedDate = od;
	}
	
	public Account(String accountNumber, String firstName, String lastName, String startDate) {
		setAccountNumber(accountNumber);
		setFirstName(firstName);
		setLastName(lastName);
		setAccountOpenedDate(new OurDate(startDate));
	}

	public double getBalance() {
		return startingBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	private void setAccountNumber(String accountNumber) {	
		//TODO #1: Run the 'Lab 6 TODO generator.jar' file and follow the instructions.
		// Write the code here to test for the error condition indicated
		// when the user attempts to enter a bad account number, and throw
		// a BadAccountInputException containing the message provided.
		// Only if there is no error should the account number be set.
		
//		TODO #1: Bad account number entered.
//
//		Customer number cannot be all zero's.
//		Error message to output: Customer number cannot be 000000
		//String other = "000-000000";
		String other = "000000";
		if (accountNumber.contains(other)) {//(000-000000)) {
			
			//compareTo(String)
			System.out.println("ERROR ");
			throw new BadAccountInputException("Customer number cannot be all zero's.");
		}


		this.accountNumber = accountNumber;		
		//end method
}
	
	public String getFirstName() {
		return firstName;
	}
	
	private void setFirstName(String firstName) {
		if (isInputNameCorrect(firstName)) this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	private void setLastName(String lastName) {
		if (isInputNameCorrect(lastName)) this.lastName = lastName;
	}
	
	private static boolean isInputNameCorrect(String name)  {
	//	return false;
		// TODO #2: Write the code here to test for the error condition indicated,
		// and throw a new BadAccountInputException with the message provided.
		// Only if there is no error in the name should this function return true.
//		Test if name field is null.
//		Error message to output: Name field is null
		
//		if (name.equals(name)) {
//			//throw new BadAccountInputException("Customer number cannot be all zero's.");
//		}
		if (name.isEmpty()){
			throw new BadAccountInputException ("Either fields Name cannot be null");
		}
			return true;
	}
	
	private static boolean isCheckDigitCorrect(String accountNumber ) {
		
		//accountNumber.trim();
		//"apple".substring(3);. 
		accountNumber.substring(4);
		accountNumber.substring(0, accountNumber.length() -1);
		
		int test = Integer.parseInt(accountNumber);
		
		
//		for (int i = 0; i < test.length(); i++){
//		    char c = numberString.charAt(i);        
//		    //Process char
//		}
		System.out.println(test);
		
//		for (int i=1; i < test.length; i++){
//			
//		}
		
		int[] evens = {2, 4};
		int num = Integer.parseInt(accountNumber);
		int result = 0;
		int count = 0;
		for(int i = 0; i < accountNumber.length(); i++) {	
			if(((result%2) != 0) && num != evens[i]) {
				result = evens[count]* num;
				count++;
			} else {
				count++;
			}
			
			
		}
		
		if ((result % 9 )== 0) {
			System.out.println("Checksum was successful");
			return true;
			
		} else {
			throw new BadAccountInputException("Checksum Failed");

}
		
		//int num = 56;
		//String strNum = "" + num;
//		int strLength = accountNumber.length();
//		int sum = 0;
//
//		for (int i = 0; i < strLength; ++i) {
//		  int digit = Integer.parseInt(accountNumber.charAt(i));
//		  sum += (digit * digit);
//		}
		
//		for (int i=1; i <accountNumber.length(); i++){
//			if(accountNumber.par)
//		}

		
		//	accountNumber.va
		//accountNumber.
		
		// TODO #3: Write the code here to test the account number, according to
		// the algorithm indicated.  If the check digit is correct return true, 
		// otherwise false.  Use the result to throw a new BadAccountInputException
		// in the setAccountNumber() method, with the message "Bad account number; 
		// check digit failed." if the result of this method returns false	
		
//		Description of algorithm:
//		Every even digit is multiplied by two,
//		and added to the digits in the original number. Modulus the sum of all digits by 9.  
//		Then check that this number equals the last (i.e. check) digit
//		 (assume account digits are numbered 123456, where the last digit, 6, 
//		is the check digit; the first five digits are the ones the algorithm applies to).
		
		//for example: for 1,2,3,4,5
		//2*2=4, 4*2=8
		//1+4+3+8+5= 21
		//prob is 1+2+3+4+5+4+8= 
		
		//
		//return true;
	}

	
}
