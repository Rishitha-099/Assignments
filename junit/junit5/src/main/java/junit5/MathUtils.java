package junit5;

public class MathUtils {
	public int add(int x, int y) {
		return x + y;
	}
	public int divide(int x,int y)
	{
		return x/y;
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	public int[] findMinMax(int[] array,int num) {
		int max= array[0];
		int min= array[0];
		for(int i=1;i<num;i++)
		{
			if(array[i]>max)
				max=array[i];
			else if(array[i]<min)
				min=array[i];
		}
		int r[]= {min,max};
		return r;
		
	}
	

}
