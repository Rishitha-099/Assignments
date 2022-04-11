package junit5;
import java.util.Arrays;

public class singleobjectMinMax {
	public int Min(int[] array) {
		Arrays.sort(array);
		return array[0];
	}
	public int Max(int[] array) {
		Arrays.sort(array);
		return array[array.length-1];
	}

}
