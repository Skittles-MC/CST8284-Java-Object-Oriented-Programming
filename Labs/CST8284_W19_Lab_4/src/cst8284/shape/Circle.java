package cst8284.shape;

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
   @Override
   public double getArea() {
     return this.getWidth() * this.getWidth();
   }

@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return 0;
}
   
   // Perimeter of a circle is 2*Math.PI*radius (where radius is width/2)
   // Area of a circle is Math.PI*radius*radius
   
}
