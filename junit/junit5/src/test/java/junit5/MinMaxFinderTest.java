package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

MinMaxFinder minmaxfinder;
	
	@BeforeAll
	static void BeforeAllinit() {
		System.out.println("Checking Min and Max values");
	}
	
	@BeforeEach
	void init() {
		minmaxfinder=new MinMaxFinder();
	}
	int[] array=new int[] {27, 23, 6,9, 18, 22, 10, 13, 31, 27, 4, 16, 19, 21, 8, 12};
	

	@Test
	void MinMaxValue() {
		int[] expected= {4,31};
		int[] Value=minmaxfinder.findMinMax(array, 16);
		assertArrayEquals(expected, Value,"we should get Max and Min values");

}
}
