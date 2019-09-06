package generics;

public class Square extends GeometricShape {

	public Square() {
		this(1.0);
	} // default constructor

	public Square(double width) {
		setWidth(width);
	} // base constructor

	public Square(Square square) {
		square.getWidth();
	} // copy constructor

	@Override
	public String toString() {
		return ("Square Overrides " + super.toString());
	}

//	@Override
//	public boolean equals(Object obj) {
//		return ((obj instanceof Square) && ((Square) obj).getWidth() == this.getWidth());
//	}

	// Area of a square width*width
	@Override
	public double getArea() {
		return this.getWidth() * this.getWidth();
	}

	// Perimeter of a square is 4*width
	@Override
	public double getPerimeter() {
		return this.getWidth() * 4;
	}

}
