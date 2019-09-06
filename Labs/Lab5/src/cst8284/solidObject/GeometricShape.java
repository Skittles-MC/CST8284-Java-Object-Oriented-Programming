package cst8284.solidObject;

public abstract class GeometricShape {
	
	private double width;
	
	public double getWidth(){return width;}
	public void setWidth(double width){this.width = width;}

	GeometricShape(){		
		// should always have a no-arg constructor in the superclass
	}
	
	@Override
	public String toString(){
		return ("GeometricShape Overrides " + super.toString());
	}
	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof GeometricShape)) return false;
		GeometricShape geoShape = (GeometricShape) obj;
		return (geoShape.getWidth() == getWidth());
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
