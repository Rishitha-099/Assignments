package datastructure;

import java.util.Scanner;
class Login{
	static String userId = "Ajay";
	    static String password = "password";
	    static int x=3;
	public static String loginUser(String user, String pass) {
		x--;
		String y="";
		         if((user.equals(userId)&&pass.equals(password))) {
		        	 return "Welcome "+userId;
		         }
		         else if(x>=1) {
		        	 System.out.println("You have entered wrong credentials , please enter right credentials");
		        	 cui.main(null);
		         }
		         else {
		        	 return "have entered wrong credentials 3 times \nContact Admin";
		         }
		return y;    
	}
}
public class cui {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("userId: ");
		String user=sc.next();
		System.out.println("password: ");
		String pass=sc.next();
		System.out.print(Login.loginUser(user, pass));
		
	

	}

}
