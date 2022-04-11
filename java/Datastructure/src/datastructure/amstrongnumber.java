package datastructure;

public class amstrongnumber {

	public static void main(String[] args) {
		int num=371, n,r,result=0;
		n=num;
		while(n!=0)
		{
			r=n%10;
			result+=Math.pow(r,3);
			n/=10;
		}
		if(result == num)
			System.out.println(num+ " is an armstrong number.");
		else
			System.out.println(num+ " is not an Armstrong number.");

	}

}
