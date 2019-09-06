
import java.util.Scanner;

public class AccountLauncher {
	private static Account act;
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] main) {
		boolean accountNotLoaded = true;
		do 
			accountNotLoaded = loadAccountInfo();
		 while (accountNotLoaded);
		
		System.out.println(AccountLauncher.displayAccountInfo());
	}

	private static boolean loadAccountInfo() {
		boolean accountNotLoaded = true;
		try {
			System.out.println("Input customer first name: ");
			String firstName = in.nextLine();

			System.out.println("Input customer last name: ");
			String lastName = in.nextLine();

			System.out.println("Input customer account number (using format 123-123456): ");
			String actNum = in.nextLine();
			
			System.out.println("Input account startup date as DD/MM/YYYY");
			String actStartUpDate = in.nextLine();

			setAccount(new Account(actNum, firstName, lastName, actStartUpDate));
			accountNotLoaded = false;
			
			
		} catch (BadAccountInputException ex) {
			System.out.println(ex.getMessage() + "; please re-enter\n");
		} catch (Exception ex) {
			System.out.println("General exception thrown; source unknown");
		}
		return accountNotLoaded;
	}

	public static String displayAccountInfo() {
		String outputString;
		try {
			outputString = "Customer First name: " + getAccount().getFirstName() 
				+ "\nCustomer Last name: "+ getAccount().getLastName() 
				+ "\nCustomer Account number: " + getAccount().getAccountNumber()
				+ "\nCurrent Balance: " + getAccount().getBalance()
				+ "\nAccount Created: " + getAccount().getAccountOpenedDate().toString();
			return outputString;
		} catch (NullPointerException ex) {
			return "Requested account does not exist";
		} catch (Exception ex) {
			return "General exception thrown, unknown cause";
		}
	}

	public static Account getAccount() {
		return act;
	}

	public static void setAccount(Account act) {
		AccountLauncher.act = act;
	}
}
