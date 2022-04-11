package datastructure;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=0,income;
		System.out.println("Enter Income: ");
		income=sc.nextDouble();
		if(income>0 && income<=180000)
			a=0;
		else if(income>180000 && income<=300000)
			a=0.1*(income);
		else if(income>300001 && income<=500000)
			a=0.2*(income);
		else if(income>500001 && income<=1000000)
			a=0.3*(income);
		System.out.println("The Tax Amount is :" +a);

	}

}
