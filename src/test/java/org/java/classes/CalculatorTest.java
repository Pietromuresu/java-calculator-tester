package org.java.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void beforeAll() {
		calc = new Calculator();
	}
	
	
	@Test
	@DisplayName("Sum test")
	public void testSum() {
		
		
		float sum = calc.add(1, 5);
		
		assertEquals(6, sum);
	}
	
	
	@Test
	@DisplayName("Subtract test")
	public void testSubtract() {
		
		
		float subtraction = calc.subtract(1, 5);
		
		assertEquals(-4, subtraction);
	}
	
	
	@Test
	@DisplayName("Divide test")
	public void testDivide() {
		
		float division = 0;
		try {
			
			division = calc.divide(6, 2);
		
		}catch(Exception e) {
			e.getMessage();
		}
		
		assertEquals(3, division);
	}
	
	
	
	@Test
	@DisplayName("Divide for zero test")
	public void testDivideForZero() {
		
		
		assertThrows(Exception.class, 
				() -> calc.divide(3, 0) , 
				"Can't divide for 0");
	}
	
	
	@Test
	@DisplayName("Multiply test")
	public void testMultilpy() {
		
		
		float multiplication = calc.multiply(2, 5);
		
		assertEquals(10, multiplication);
	}
	
}
