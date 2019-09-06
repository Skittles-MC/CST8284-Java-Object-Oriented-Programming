package calculator;

public class Calculator {
	
	private double accumulator;
	
	public Calculator() {}
	
	public Calculator(double accumulator) {
		this.accumulator = accumulator;
	}
	
	public double getAccumulator() {
		return accumulator;
	}

	public void setAccumulator(double accumulator) {
		this.accumulator = accumulator;
	}
	
	public double add(double x, double y) {
		
		this.accumulator = x + y;
		
		return accumulator;
	}
	
	public double squareRoot(double x) {
		
		this.accumulator = Math.sqrt(x);
		
		return this.accumulator;
	
	}
	
	public double subtract(double x, double y) {
		
		this.accumulator = x - y;
		
		return accumulator;
	}

	public double multiply(double x, double y) {
	
		this.accumulator = x * y;
		
		return accumulator;
	}

	public double divide(double x, double y) {
		
		this.accumulator = x / y;
		
		return accumulator;
	}
	
	public int modulus(int x, int y) {
		
		this.accumulator = x % y;
		
		return (int)accumulator;
	}		
}//END CLASS CALCULATOR
