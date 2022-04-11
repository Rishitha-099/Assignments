package exceptionhandling;

public class division {

	public static void main(String[] args) {
		int x=9,y=3;
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero operation is not possible");
		}
		
	}

}
