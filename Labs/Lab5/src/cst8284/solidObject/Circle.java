package cst8284.solidObject;

public class Circle extends GeometricShape {
	
   public Circle(){this(1.0);}   // default constructor
   public Circle(double diameter){setWidth(diameter);}   // base constructor
   public Circle(Circle circle){circle.getWidth();}   // copy constructor
   
   @Override
   public String toString(){return ("Circle Overrides " + super.toString());}
   
   @Override
   public boolean equals(Object obj){
	   return ((obj instanceof Circle) && ((Circle)obj).getWidth() ==this.getWidth());
   }
   public double getRadius() {
		double radius = this.getWidth() / 2;
		return radius;
	}
   
	// Perimeter of a circle is 2*Math.PI*radius (where radius is width/2)
	@Override
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * getRadius();
		
		return perimeter;
	}
   // Area of a circle is Math.PI*radius*radius
	@Override
	public double getArea() {
		double area = Math.PI * getRadius() * getRadius();
		return area;

	}
}
