package cst8284.solidObject;

import java.util.ArrayList;

public class SolidObjectsLauncher {
	
   // TODO: define a new static ArrayList of type SolidObject called solidObjects.
	public static ArrayList<SolidObject<GeometricShape>> solidObjects = new ArrayList<>(); 
   public static void main(String[] args){

		/* TODO
		 * Load the ArrayList declared above with the following four SolidObjects,
		 * which must be instantiated with the values shown below
		 * 
	     *          shape                   depth
	     *  
	     *        Circle(3.0)               5.0
	     *        Rectangle(10.0, 9.0)      2.0
	     *        Rectangle(3.0, 6.0)       10.0
	     *        Square(6.0)    
	     *        
	     * Note that the last SolidObject is a cube constructed using the Square
	     * GeometricShape.  For this, use the one-arg SolidObject constructor.  For 
	     * the other three, use the two-arg constructor.
	    */
 
	   solidObjects.add(new SolidObject<GeometricShape>(new Circle(3), 5));
	   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(10, 9), 2));
	   solidObjects.add(new SolidObject<GeometricShape>(new Rectangle(3, 6), 10));
	   solidObjects.add(new SolidObject<GeometricShape>(new Square(6)));
	   
	  displayVolumeComparison(solidObjects);   // method already declared below
      displaySurfaceAreaComparison(solidObjects);  // method already declared below

   }
	
   // TODO: Create a public static method isVolumeEqual() that takes two SolidObjects as 
   // parameters, and if they have the same volume, returns true, otherwise false.  This
   // method is called by the displayVolumeComparison method, whose code is provided below.
   public static boolean isVolumeEqual(SolidObject<GeometricShape> test1, SolidObject<GeometricShape> test2) {
	    return test1.getVolume() == test2.getVolume();
	  }

   
   // TODO: Create a public static method isSurfaceAreaEqual() that takes two SolidObjects 
   // as parameters and if they have the same surface area, returns true, otherwise false.  
   // This method is called by the displayVolumeComparison method, whose code is provided below.

   public static boolean isSurfaceAreaEqual(SolidObject<GeometricShape> test1, SolidObject<GeometricShape> test2) {
	    return test1.getSurfaceArea() == test2.getSurfaceArea();
	  }
	
   public static void displayVolumeComparison(ArrayList<SolidObject<GeometricShape>> arList){
		
      // Print out column header
      System.out.println("\n\nCompare the two object's volumes.  Are they equal?");
	  System.out.print("\t\t");
      for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
	 // Print out each row,starting with the name of the object
	 for (SolidObject<GeometricShape> solidObjRow: arList){
	    System.out.println();	// Next line
	    System.out.print(solidObjRow);
            for (SolidObject<GeometricShape> solidObjColumn: arList)
               System.out.print("\t\t" + isVolumeEqual(solidObjColumn, solidObjRow));
         }    
      }
	
   public static void displaySurfaceAreaComparison(ArrayList<SolidObject<GeometricShape>> arList){
      
	   System.out.println("\n\nCompare the two object's surface areas.  Are they equal?");  
	   // Print out the header
	   System.out.print("\t\t");
       for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
      // Print out each row,starting with the name of the object
      for (SolidObject<GeometricShape> solidObjRow: arList){
         System.out.println();	// Next line
         System.out.print(solidObjRow);
         for (SolidObject<GeometricShape> solidObjColumn: arList)
            System.out.print("\t\t" + isSurfaceAreaEqual(solidObjColumn, solidObjRow));  
      }
   }
}
/***
 * Questions in the from pdf
 * - Identify three separate, distinct instances of polymorphism in this program
 * This one is a question
 * 	polymorphism and generics are the same thing but they just have different names. 
 * Circle, retangle, sqaure are all types of GeometricShape 
 * uhhhhhhhhhhhhhhhhhhhhhhhhhh do later
 * 
 * Polymorphism is the ability of an object to take on many forms.
 * The reason for using polymorphysm is to be able to call the same method with 
 * different implementations, without at that moment having to know what the exact implementation is. 
 * 
 * - Why is it essential to use abstract methods in superclasses (such as GeometricShape)? 
 *   How would the calculation for the volume and surface area of the shapes be affected 
 *   if these abstract methods were missing from the superclass?
 *   this one as well
 *   
 *   How does one define theses two methods
 *   public abstract double getArea();
	 public abstract double getPerimeter();
 *   The thing is we cant define these two methods since we don't know the precise shape.... The two methods are basically
 *   place holders for a later mention at another level. Theses two methods will be implemented differently into the other subclasses
 *   For example Area of a circle is PIr^2 ; is different from a rectangle: width * length.
 *   We understand that the common concept of area and parameter is possible for all shapes. 
 *   But there isnt a need to provide a detailed description of area and parameter since its different for each shape.
 *   Hence we define it as an abstract methods.
 *   
 *   
 * - How would using a generic type T, rather than the bounded type T extends GeometricShape, 
 * 	 affect the program? What errors could occur if the type was left unbounded, and when 
 *   would you expect to see them?
 *   this one?
 *   Do later
 *   uh the memory mpa tho
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 * - How are generic types represented in the Eclipse debugger?
 * 
 * - Why is it preferable to use methods like getPerimeter() and getArea() to calculate 
 *   the surface area and volume of the 3D objects, rather than using each GeometricShape 
 *   object’s getWidth() and getHeight() methods?
 *   
 *   
 * - The SolidObject class combines a 2D GeometricShape object with a third dimension, 
 *   identified as the depth. (The word ‘Solid’ is used here to indicate an object in three dimensions. 
 *   A better name for this class might be 3DObject, but that identifier can’t be used (Why?))   
 * 
 */
