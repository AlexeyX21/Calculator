package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.numbers.Calculator.*;
class CalculatorTest {

	@Test
	void testSum() {
		assertEquals(4.0, sum(2, 2));
		assertEquals(0, sum(2, -2));
		assertEquals(6.5, sum(2, 4.5));
	}

	@Test
	void testSubtract() {
		assertEquals(0, subtract(2, 2));
		assertEquals(4, subtract(2, -2));
		assertEquals(2, subtract(4, 2));
	}

	@Test
	void testMultiply() {
	    assertEquals(4, multiply(2, 2));
	    assertEquals(-4, multiply(2, -2));
	    assertEquals(4, multiply(-2, -2));
	}

	@Test
	void testDivide() {
		assertEquals(2.5, divide(5, 2));
		assertEquals(Double.NEGATIVE_INFINITY, divide(-5, 0));
		assertEquals(Double.POSITIVE_INFINITY, divide(5, 0));
		assertEquals(-2.5,divide(-5, 2));
		assertEquals(2.5, divide(-5, -2));
	}

}
