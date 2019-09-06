package generics;

public class Rectangle extends Square {
	private double height;

	public Rectangle() {
		this(1.0, 1.0); // default width and height to 1
	}

	public Rectangle(double width, double height) {
		super(width); //
		this.setHeight(height);
	}

	public Rectangle(Rectangle rectangle) {
		this(rectangle.getWidth(), rectangle.getHeight());
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	@Override
	public double getArea() {
		return this.getWidth() * this.getHeight();
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.getHeight() + this.getWidth());
	}

	@Override
	public String toString() {
		return ("Rectangle Overrides " + super.toString());
	}

//	@Override
//	public boolean equals(Object that) {
//		return (that instanceof Rectangle && super.equals(that) && this.getHeight() == ((Rectangle) that).getHeight());
//	}

}
