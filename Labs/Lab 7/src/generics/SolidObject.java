package generics;


public class SolidObject<T extends GeometricShape> {

	// TODO: Use the UML diagram to create the members required

	private T shape;
	private double depth;

	protected SolidObject(T shape, double depth) {
		this(shape);
		this.setDepth(depth);
	}

	protected SolidObject(T shape) {
		this.setGeometricShape(shape);
		this.setDepth(shape.getWidth());
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public T getGeometricShape() {
		return shape;
	}

	public void setGeometricShape(T shape) {
		this.shape = shape;
	}

	public String toString() {
		String solidTypeEquivalent = "unknown   ";
		String className = getGeometricShape().getClass().toString();
		className = className.substring(className.lastIndexOf('.') + 1);
		switch (className) {
		case "Circle":
			solidTypeEquivalent = "cylinder ";
			break;
		case "Square":
			solidTypeEquivalent = "cube     ";
			break;
		case "Rectangle":
			solidTypeEquivalent = "block    ";
			break;
		case "Triangle":
			solidTypeEquivalent = "prism    ";
			break;
		}
		return solidTypeEquivalent;
	}


	public double getVolume() {
		return this.getGeometricShape().getArea() * this.getDepth();
	}

	public double getSurfaceArea() {
		return this.getGeometricShape().getPerimeter() * this.getDepth() + this.getGeometricShape().getArea() * 2;
	}

	  @Override
	  public boolean equals(Object obj) {
	    return (this.getVolume() == ((SolidObject) obj).getVolume());
	  }
	  //return (this.getArea() ==((GeometricShape) obj).getArea());
}
