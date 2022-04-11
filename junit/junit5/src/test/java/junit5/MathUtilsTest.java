package junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class MathUtilsTest {
	MathUtils mathutils;
	
	@BeforeAll
	static void beforeallinit() {
		System.out.println("this needs to run before all");
	}
	
	@BeforeEach
	void init() {
		mathutils=new MathUtils();
	}
	@AfterEach
	void cleanup() {
		System.out.println("cleaning up..");
	}
	@AfterAll
	static void afterAllinit() {
		System.out.println("The method needs to run after all");
	}
	@Nested
	@DisplayName("Add Method")
	class AddTest{
		@Test
		@DisplayName("Add method for positive numbers")
		public void testAddPositive() {
			assertEquals(2, mathutils.add(1, 1));
		}
		@Test
		@DisplayName("Add method for negative numbers")
		public void testAddNegative() {
			assertEquals(-2, mathutils.add(-1, -1));
		}
		
	}
		@Test
		@DisplayName("Division Method")
		public void testDivide() {
			assertThrows(ArithmeticException.class, ()-> mathutils.divide(2, 0), "Can't divide by zero");	
		}
		
		@Test
		@DisplayName("Multiplication Method")
		public void testMultiply() {
			assertAll(
					()-> assertEquals(6, mathutils.multiply(3, 2)),
					()-> assertEquals(-2, mathutils.multiply(-1, 2))		
					);
		}
		int[] arr=new int[] {27, 23, 6,9, 18, 22, 10, 13, 31, 27, 4, 16, 19, 21, 8, 12};
		@Test
		public void MaxValue() {
			int[] expected= {4,31};
			int[] MaxMinValue=mathutils.findMinMax(arr, 16);
			assertArrayEquals(expected, MaxMinValue,"should get max and min value");
		}
	

	

}
