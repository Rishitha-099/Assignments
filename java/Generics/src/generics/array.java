package generics;
class generic<T>{
	public T[] swap(T[] x, int a, int b) {
		T temp = x[a];
		x[a] = x[b];
		x[b] = temp;
		return x;
	}
}

public class array {

	public static void main(String[] args) {
		Integer array[]= {1,2,3,4,5};
		generic<Integer>objgeneric = new generic<>();
		Integer[] array1=objgeneric.swap(array, 0, 2);
		for(int a : array1) {
			System.out.println(a);
		}

	}

}
