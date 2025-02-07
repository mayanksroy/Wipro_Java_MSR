package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	void SetUp() {
		calc = new Calculator();
	}
	
	@Test
	void testadd() {
		assertEquals(9, calc.sum(4, 5));
	}
	
	@Test
	void testminus() {
		assertEquals(1, calc.sub(5, 4));
	}
	
	@Test
	void testdivide() {
		assertThrows(ArithmeticException.class, () -> calc.division(10, 0), "should throw divison by zero");
	}
	
	@Test
	void testdivide2() {
		assertEquals(2, calc.division(4, 2));
	}
	
	@ParameterizedTest
	@CsvSource({"1, 2, 3", "4, 5, 9", "10, 30, 40"})
	void testAddParameterized(int a, int b, int expected) {
		assertEquals(expected, calc.sum(a, b));
	}
	
	@AfterEach
	void TearDown() {
		calc = null;
	}
}
