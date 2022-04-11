package datastructure;

public class Amstrongnum {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
				int num=i; int x=0; int y=0;
				while(num>0) {
					x=num%10;
					y=y+(x*x*x);
					num=num/10;
				}
				if(i==y) {
					System.out.println(i + "is Armstrong number");
				}
			}
		}
		

}
