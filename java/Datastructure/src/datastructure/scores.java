package datastructure;

import java.util.Scanner;
public class scores {

	public static void main(String[] args) {
		
		int x1,y1,z1,x2,y2,z2,x3,y3,z3,a=0,a1=0,a2=0,a3=0;
		float avg=0,avg1=0,avg2=0,avg3=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of student 1:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		z1=sc.nextInt();
		System.out.print("Enter the marks of student 2:");
		x2=sc.nextInt();
		y2=sc.nextInt();
		z2=sc.nextInt();
		System.out.print("Enter the marks of student 3:");
		x3=sc.nextInt();
		y3=sc.nextInt();
		z3=sc.nextInt();
		a=x1+y1+z1+x2+y2+z2+x3+y3+z3;
		avg=a/3;
		a1=x1+x2+x3;
		a2=y1+y2+y3;
		a3=z1+z2+z3;
		avg1=a1/3;
		avg2=a2/3;
		avg3=a3/3;
		System.out.println(a);
		System.out.println(avg);
		System.out.println(a1);
		System.out.println(avg1);
		System.out.println(a2);
		System.out.println(avg2);
		System.out.println(a3);
		System.out.println(avg3);
	}

}
