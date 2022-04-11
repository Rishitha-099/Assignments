package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class singleobjectMinMaxTest {
	singleobjectMinMax find;
	@BeforeEach
	void beforeEach() {
		find=new singleobjectMinMax();
	}

	@Test
	void test() {
		assertAll(
				()->assertEquals(2, find.Min(new int[] {2,4,6,8,10})),
				()->assertEquals(10, find.Max(new int[] {2,4,6,8,10}))
				);
	}

}
