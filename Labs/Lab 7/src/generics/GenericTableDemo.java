package generics;

import java.util.ArrayList;
import java.util.Arrays;




public class GenericTableDemo {


	  private static String[] myStrings = {"myString",new String("myString"),"myString"};
	  private static ArrayList<GeometricShape> basicShapes = new ArrayList<>();
	  private static ArrayList<SolidObject> solidObjects = new ArrayList<>();
	  
	  public GenericTableDemo() {
	  }
	  
	  public static void main(String[] args) {
	    
	    // Integers
	     Table.displayEqualityTable(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));

	    // Strings 
	     Table.displayEqualityTable(new ArrayList<String>(Arrays.asList( myStrings )));
	    
	    // BasicShapes
	    basicShapes.add(new Circle(3));
	    basicShapes.add(new Square(6));
	    basicShapes.add(new Rectangle(10, 9));
	    basicShapes.add(new Rectangle(3, 6));
	    Table.displayEqualityTable(basicShapes);
	    
	    // SolidObjects 
//	    solidObjects.add(new SolidObject<GeometricShape>(new Circle(3), 5));
//		   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(10, 9), 2));
//		   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(3, 6), 10));
//		   solidObjects.add(new SolidObject<GeometricShape>(new Square(6)));
		   
		   solidObjects.add(new SolidObject<GeometricShape>(new Circle(3), 5));
		   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(10, 9), 2));
		   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(3, 6), 10));
		   solidObjects.add(new SolidObject<GeometricShape>(new Square(6)));
	    Table.displayEqualityTable(solidObjects);
	    
	  }

}
