package calculatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTester {

	final double EPSILON = 1e-9;
	Calculator c = null;
	
	@BeforeAll
	public static void setUpBeforeClass() {
		System.out.println("Starting test.......");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Before test.......");
		c = new Calculator();
	}
	@AfterEach
	public void tearDown() {
		System.out.println("After test........");
		c = null;
	}
	@AfterAll
	public static void tearDownAfterClass() {
		System.out.println("Finished testing...");
	}
	@Test
	public void testAdd() {
		//assertEquals(int expected, int actual)
		
		Calculator c = new Calculator();
		
		//double square = resi;t * result -2;
		assertEquals(3, c.add(2, 1));
	}
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		assertEquals(4, c.subtract(6, 2));
	}

	@Test
	public void testModulus() {
		Calculator c = new Calculator();
		assertEquals(10, c.modulus(10, 100));
	}
	
	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		assertEquals(25, c.multiply(5, 5));
	}
	
	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		assertEquals(5, c.divide(25, 5));
	}
	
	@Test
	public void testMultiplyForInfinity() {
		Calculator c = new Calculator();
		assertEquals(Double.POSITIVE_INFINITY, c.multiply( Double.MAX_VALUE, 2));
	}
	
	@Test
	public void testDivideByZero() {
		Calculator c = new Calculator();
		assertEquals(Double.POSITIVE_INFINITY, c.divide(EPSILON, 0));
	}

	@Test
	public void testDivideBySelf() {
		Calculator c = new Calculator();
		assertEquals(1, c.divide(2, 2));
	}
	
	@Test
	public void testSqrtPositive() {
		Calculator c = new Calculator();
		assertEquals(2, c.squareRoot(4), EPSILON);
	}
	
	
	@Test
	public void testSqrtNegative() {
		Calculator c = new Calculator();
		assertEquals(Double.NaN, c.squareRoot(-4));
	}
	
}
