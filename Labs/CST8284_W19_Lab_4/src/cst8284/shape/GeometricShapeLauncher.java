package cst8284.shape;

public class GeometricShapeLauncher {

	public static void main(String[] args) {
		display1DArrayOfPrimitives();
		display2DArrayOfPrimitives();
		display1DArrayOfObjects();
		display2DArrayOfObjects();
	}

	public static void display1DArrayOfPrimitives() {
		System.out.println("Loading 1D array of primitives...");

		int[] oneDimensionalArray = null; // note that array object is null initially
		oneDimensionalArray = new int[] { 1, 2, 3 }; // assign new array object to variable

		for (int i : oneDimensionalArray)
			System.out.print(i + " ");
	}   // TODO: Task 1: Put a breakpoint on the line above, execute in debug to that
		// line, and draw the memory map of the oneDimensionalArray using the instructions in
		// the lab 4 document

	public static void display1DArrayOfObjects() {
		int radius = 1;
		System.out.println("\n\nLoading 1D array of reference types...");

		// Define an array to hold three GeometricShape elements
		GeometricShape[] oneDimensionalArrayOfRefs = new GeometricShape[3];

		// Load singleDimensionalArrayOfRefs with 3 Circle objects of increasing
		// diameter
		for (int i = 0; i < oneDimensionalArrayOfRefs.length; i++) // gs is each element of the array
			oneDimensionalArrayOfRefs[i] = new Circle(radius++);
		// TODO: Task 2: Put a breakpoint on the line above, load the array with the three
		// Circles by stepping over the line three times, and draw the memory map using the
		// instructions in the lab 4 document

		// Now display the radius of the three Circles
		for (GeometricShape gs : oneDimensionalArrayOfRefs)
			System.out.println("Circle radius = " + gs.getWidth() + "    ");
	}

	public static void display2DArrayOfPrimitives() {
		System.out.println("\n\nLoading 2D array of primitives...");

		int[][] twoDimensionalArray = new int[][] { { 1, 2, 3 }, { 2, 4, 6 } };
		// TODO: Task 3: Put a breakpoint on the line above, step over the line,
		// and draw the memory map of the twoDimensionalArray using the instructions
		// in the lab 4 document

		// Output the values
		for (int[] row : twoDimensionalArray) {
			for (int column : row)
				System.out.print(column + "    ");
			System.out.println();
		}
	}

	public static void display2DArrayOfObjects() {

		System.out.println("\n\nLoading 2D array of reference values...");

		GeometricShape[][] twoDimensionalArrayOfObjects = new GeometricShape[][] { 
			    { new Circle(1), new Circle(2) },
				{ new Square(2), new Square(4) }, 
				{ new Circle(3), new Circle(6) } };
		// TODO: Task 4: Put a breakpoint on the definition above, step over the 
		// line to the line below, and draw the memory map of the 
		// twoDimensionalArrayOfObjects using the instructions in the lab 4 document

		// Output the values
		for (GeometricShape[] row : twoDimensionalArrayOfObjects) {
			for (GeometricShape element : row) 
				System.out.print(((element instanceof Circle) ? "Circle " : "Square ") + 
				"area = " + element.getArea() + "    ");	
			System.out.println();
		}
	}

}
