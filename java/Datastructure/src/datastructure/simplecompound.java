package datastructure;

import java.util.Scanner;

public class simplecompound {

	public static void main(String[] args) {
		double p,r,time,simple,compound;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount: ");
		p=sc.nextDouble();
		System.out.println("enter no of years: ");
		time=sc.nextDouble();
		System.out.println("Enter Rate of Interest");
		r=sc.nextDouble();
		simple=(p*time*r)/100;
		compound=p*Math.pow(1.0+r/100.0, time)- p;
		System.out.println("Simple Interest = "+simple);
		System.out.println("Compound Interest ="+compound);
		

	}

}
