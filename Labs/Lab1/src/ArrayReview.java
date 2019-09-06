//package lab1startercode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayReview {

	public void labDemo1() {
			
		System.out.println("LAB 1 DEMO 1\n");
		
		//TODO:  declare and initialize an integer array with an initialization list.
		int[] myIntArray = {41, 7, 11, 23, 5};
		
		//TODO:  UNCOMMENT - WHY IS THIS A SYNTAX ERROR?
		//int [] integers = new int{41, 7, 11, 23, 5};
		//missing [] after int
		
		//TODO:  print out the array using a regular for loop
		System.out.print("PRINT 1-D ARRAY USING REGULAR FOR LOOP\t\t\n");
		for (int i=0; i<(myIntArray.length); i++ ) {
			System.out.println(myIntArray[i]);
		}
		
		System.out.println();
		
		//TODO:  print out the array using an enhanced for loop - see Deitel chapter 7.7
		System.out.print("PRINT 1-D ARRAY USING ENHANCED FOR LOOP\t\t\n");
		for ( int number : myIntArray){
			System.out.println(number);
		}
		
		System.out.println();
		
		
		//TODO:
		//search the array for an integer
		//use a method from class Arrays from the API:
		// use a selection structure to print out an appropriate message, pending the finding of the integer
		//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
		int searchkey =11; 
		int isFound = Arrays.binarySearch(myIntArray, searchkey);
		
		if(isFound != -1)
			System.out.println("\nARRAY ELEMENT " + searchkey + " FOUND IN ARRAY INDEX POSITION "+ isFound);
		else
			System.out.println("ARRAY ELEMENT NOT FOUND");
		
		System.out.println();
		
		
		
		
		
		//TODO:  sort the array by using a method from class Arrays from the API:
		//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
		//see Deitel chapter 7.15
		System.out.println("Sorted Numbers ascending numerical order:");
		//TODO:  print out the sorted array
		Arrays.sort(myIntArray);
		for ( int number : myIntArray){
			System.out.println(number);
		}
		System.out.println();
		
		/**
		 
//		//TODO:
//		//search the array for an integer
//		//use a method from class Arrays from the API:
//		// use a selection structure to print out an appropriate message, pending the finding of the integer
//		//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
//		//see Deitel chapter 7.15



//		Scanner in = new Scanner(System.in);
//		 int searchValue;
//		/******for now swaping the two todos since sorting comes 1st
//		System.out.println("Searching in the array for an integer");
//		System.out.println("Enter which integer your looking for:");
//		searchValue = in.nextInt();
//		
//		int retrivalVal =  Arrays.binarySearch(myIntArray,searchValue);
//		System.out.println("The index of element " + searchValue + " is :" + retrivalVal);
		*** 
		 */
		
		
	}//end demo 1
	
	public void labDemo2() {
		
		System.out.println("LAB 1 DEMO 2\n");
		
		//TODO:  declare and instantiate a 2-D array of doubles but do not initialize it.  Use two rows and four columns.
		double[][] doubles = new double[2][4];
		
		
		//alternatively - commit to the amount of rows only
		//double [][] doubles  = new double[2][];
		
		//TODO:  print out the 2-D array using a nested for loop - before non-trivial values are added
		System.out.println("\nPRINT 2-D ARRAY USING NESTED REGULAR FOR LOOP, VALUES NOT ADDED:");
		for (int i = 0; i < doubles.length; i++) {
		    System.out.print("{");                   
		    int j; 
		    for (j = 0 ; j < doubles[i].length - 1; j++) {
		        
		        System.out.print(doubles[i][j]+", ");  
		       
		    }
		    System.out.print(doubles[i][j]+"}");         
		    if(i!=doubles.length -1){                   
		        System.out.println(", ");               
		    }
		}
			System.out.println();
		
		//TODO:  initialize the array with non-trivial values
			 //doubles[0] = {{5.2, 81.3, 24, 3.0}};
			doubles = new double[][] {{5.2, 81.3, 24, 3.0}, {11.3, 18.5, 16.1, 0.0}};
		//TODO:  UNCOMMENT - WHY IS THIS A SYNTAX ERROR?
			// doubles = {{5.2, 81.3, 24, 3.0}, {11.3, 18.5, 16.1, 0.0}};
		//^^The syntax is only permitted in declarations and in array creation expressions.
			
		//TODO:  print out the 2-D array using a nested for loop
		System.out.println("\nPRINT 2-D ARRAY USING NESTED REGULAR FOR LOOP, NON-TRIVIAL VALUES ADDED:");
		 
		for (int i = 0; i < doubles.length; i++) {
		    System.out.print("{");                   
		    int j; 
		    for (j = 0 ; j < doubles[i].length - 1; j++) {
		        System.out.print(doubles[i][j]+", ");  
		    }
		    System.out.print(doubles[i][j]+"}");         
		    if(i!=doubles.length -1){                   
		        System.out.println(", ");               
		    }
		}
		//ONLY FOR FUN - NOT REQUIRED - NESTED ENHANCED FOR LOOP
			/*
		 * for(double [] row: doubles) { for(double column: row) {
		 * System.out.print(column +" "); } }
		 */
		
		System.out.println();
		
		//TODO:  sum and print out the sum of the elements of the 2-D array
//		double total = 0.0;
//		for (int i = 0; i < doubles.length; i++) {                   
//		//    int j; 
//		    for (int j = 0 ; j < doubles[i].length - 1; j++) {
//		       total += doubles[i][j];
//		       System.out.println(total);
//		    }
//		}
//		System.out.println(total);
		
		double sum = 0;
	    for (int row=0; row < doubles.length; row++)
	    {
	        for (int col=0; col < doubles[row].length; col++)
	        {
	            sum = sum + doubles [row][col];
	        }
	    }
	    System.out.println("SUM OF 2-D ARRAY ELEMENTS: "+ sum);
	}//end demo 2
	
	public void labDemo3() {
		
		System.out.println("LAB 1 DEMO 3\n");
		
		//TODO:  declare a 1-D array of Strings
		String [] greetings = { "Jambo", "hi", "namaste", "hola", "ni hau"};
		
		//TODO:  print out the array using an enhanced for loop
		System.out.print("PRINT 1-D ARRAY USING ENHANCED FOR LOOP\t\t");
		for(String greet: greetings){
			System.out.print(greet + " ");
		}
		
		System.out.println();
		
		//TODO:  find a method to change all characters to upper case and print out the array using an enhanced for loop
		System.out.print("\nPRINT UPPERCASE 1-D ARRAY USING REGULAR FOR LOOP:  ");
		for(String greet: greetings){
			System.out.print(greet.toUpperCase() + " ");
		}
				
		System.out.println();
		
		//TODO:  find the longest String and print it out
		String longest = greetings[0];
		for (int i = 1; i < greetings.length; i++){
			if(greetings[i].length() > longest.length())
				longest = greetings[i];
		}
		System.out.println("\nLONGEST STRING IN ARRAY  "+longest);			
	}//end demo 3
	
	public void labDemo4() {
		
		System.out.println("LAB 1 DEMO 4\n");
		
		//TODO:  declare a 1-D array of references of class Book 
		Book [] books = new Book[3];
		
		//TODO:  print out the array before adding any elements
		//refer to text figure 9.12 "hashCode"
		System.out.println("BOOK ARRAY BEFORE ADDING ELEMENTS:");
		for(int i = 0; i <books.length; i++)
			System.out.println(books);
		
		System.out.println();
		
		//TODO:  initialize three books and add them to the array
		//doubles = new double[][] {{5.2, 81.3, 24, 3.0}, {11.3, 18.5, 16.1, 0.0}};
		//books = new Book[]{{  {"The Great Gatsby;", 1925}, {"The Hobbit;",1937},{"Dracula;",1897}  }}; 
		books[0] = new Book("The Great Gatsby", 1925);
		books[1] = new Book("The Hobbit",1937);
		books[2] = new Book("Dracula",1897);
		//TODO:  print out the array after adding elements
		  System.out.println("BOOK ARRAY AFTER ADDING ELEMENTS:");
		for(int i = 0; i < books.length; i++)
			System.out.println("Book Title "+ books[i].getTitle() + "; Published year " +books[i].getYearPublished());
		  
		  System.out.println();
		  		 
		  
		//  System.out.println("BOOK ARRAY AFTER SETTING ARRAY TO NULL:");
		  
		  
		  
		 	//TODO:  set the second array element equal to null and try to print it out - IT WILL THROW AN EXCEPTION
		//books[1] = null;
		
		//TODO:  set the second array element back to the non-trivial value
		//books[1] = new Book("The Hobbit", 1937);
		
		//TODO:  set the entire array to null
		books[0] = null;
		books[1] = null;
		books[2] = null;
		try {
		 System.out.println("BOOK ARRAY AFTER SETTING ARRAY TO NULL:");
			for(int i = 0; i < books.length; i++)
				System.out.println("Book Title "+ books[i].getTitle() + "; Published year " +books[i].getYearPublished());
		  System.out.println();
		}
		catch(NullPointerException e) {
			System.out.print("NullPointerException Caught"); 
		}
		
	}
	
	public void labDemo5() {
		
		System.out.println("LAB 1 DEMO 5\n");
		
		/*TODO:  ADD THE FOLLOWING toString() METHOD TO THE Book CLASS
		 * 
		 * 		@Override
					public String toString() {
					return "Book Title:  " + title + " YearPublished:  " + yearPublished;
				}//dones
		 */
		
		//TODO:  use one line of code to declare and initialize a Book array with three elements:
	Book [] books = new Book[] {new Book("The Great Gatsby", 1992), new Book("The Hobbit",1937), new Book("Dracula",1897)};
		//Book [] books = new Book[]{ ("The Great Gatsby", 1992),("The Hobbit",1937),("Dracula",1897)};
		
		//Book [] books = {"The Great Gatsby",1992}, {;
		
		//int[] myIntArray = {41, 7, 11, 23, 5};
//		books[0] = new Book("The Great Gatsby", 1925);
//		books[1] = new Book("The Hobbit",1937);
//		books[2] = new Book("Dracula",1897);
		
	//object obj = null;
	//sys.out.println(obj) implicit call to tostring
	
	//obj.toString(); explicit 
	
		//TODO:  print out the array elements - use an enhanced for loop - only pass the name of the enhanced for loop 'parameter' to the System.out.print() method
		System.out.println("BOOK ARRAY BY IMPLICITLY INVOKING toString():"); 
		for ( Book Book : books){
			System.out.println(Book);
		}
		
		System.out.println();
		
		//TODO:  print out the array elements - use an enhanced for loop - only pass the name of the 'parameter' to the System.out.print() method
		System.out.println("BOOK ARRAY BY EXPLICITLY INVOKING toString():");  
		for ( Book Book : books){
			System.out.println(Book.toString());
		}
		
		System.out.println();
		  
		//TODO:  COMMENT OUT THE toString() METHOD THAT WAS ADDED TO THE Book CLASS
	    //print out the array elements - use an enhanced for loop - only pass the name of the 'parameter' to the System.out.print() method
		System.out.println("BOOK ARRAY BY IMPLICITLY INVOKING toString() WITH toString() COMMENTED OUT:"); 
	
			for ( Book Book : books){
			System.out.println(Book);
		
	}
	}
	
	public void labDemo6() {
		
		System.out.println("LAB 1 DEMO 6 \n");
		
		//TODO:  MAKE CERTAIN THAT toString() IN THE Book CLASS IS COMMENTED OUT
	
		//TODO:  use one line of code to declare and instantiate a Book array with three elements - do not initialize the individual elements:
			Book [] books = new Book[3];
		//TODO:  print out the array elements - use an enhanced for loop - only pass the name of the enhanced for loop 'parameter' to the System.out.print() method
		System.out.println("BOOK ARRAY BY IMPLICITLY INVOKING toString() WITH toString() IN THE Book CLASS COMMENTED OUT:"); 
		for ( Book book : books){
			System.out.println(book);
		}
		
		System.out.println();
		
		//TODO:  print out the array elements - use an enhanced for loop - only pass the name of the 'parameter' to the System.out.print() method
		  System.out.println("BOOK ARRAY BY EXPLICITLY INVOKING toString() WITH toString() IN THE Book CLASS COMMENTED OUT:"); 
	try {
		 for ( Book Book : books){
				System.out.println(Book.toString());
			}
	}
		 catch(NullPointerException e) {
				System.out.print("NullPointerException Caught"); 
			}
	
		 
		  System.out.println();
		 
		//TODO:  UNCOMMENT toString() IN THE Book CLASS AND TRY TO RUN labDemo6() one more time - are the results different with toString() available?
		  //Still passes exception in thread with tostring still 
		
		//TODO:  print out the array elements - use an enhanced for loop - only pass the name of the enhanced for loop 'parameter' to the System.out.print() method
		  System.out.println("BOOK ARRAY BY IMPLICITLY INVOKING toString() WITH toString() IN THE Book CLASS AVAILABLE:");
		  for ( Book book : books){
			  System.out.println(book);
			}
		  
		  System.out.println();
		  
		  //TODO:  Add elements to array, make certain that toString() is available, and print
			books[0] = new Book("The Great Gatsby", 1925);
			books[1] = new Book("The Hobbit",1937);
			books[2] = new Book("Dracula",1897);
		  
		  System.out.println("INITIALIZED BOOK ARRAY, IMPLICITLY INVOKE toString() WITH toString() IN THE Book CLASS AVAILABLE:"); 
			for ( Book Book : books){
				System.out.println(Book);
			}	
		
	}//end demo 6
}//end lab
