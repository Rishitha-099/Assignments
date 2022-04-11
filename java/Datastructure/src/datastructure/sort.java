package datastructure;

public class sort {

	public static void main(String[] args) {
		int num,i,j,x=0;
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		num=a.length;
		for(i=0;i<num;i++) {
			for(j=0;j<(num-1);j++) {
				if(a[j]>a[j+1]) {
					x=a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
		}
		for(i=0;i<num;i++) {
			System.out.println(a[i]);
		}

	}

}
