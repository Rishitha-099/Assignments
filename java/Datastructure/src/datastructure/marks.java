package datastructure;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>60 && y>60 && z>60)
			System.out.println("Passed");
		else if(x+y>60 || y+z>60 || z+x>60)
			System.out.println("Promoted");
		else if(x>60 || y>60 || z>60 || x+y+z<60)
		    System.out.println("Failed");
		
	}

}
