package collectionLevel1;
import java.util.*;

public class dateofbirth {
	int d,m,y; //date,month,year
	public dateofbirth(int d,int m,int y) {
		this.d= d;
		this.m= m;
		this.y= y;
		
	}
	public String toString() {
		return d+"-"+m+"-"+y;
	}
	public int getyear() {
		return y;
	}

	public static void main(String[] args) {
		LinkedList<dateofbirth> dob = new LinkedList<>();
		
		dob.add(new dateofbirth(05,12,2000));
		dob.add(new dateofbirth(06,06,1997));
		dob.add(new dateofbirth(04,01,1984));
		dob.add(new dateofbirth(18,12,1988));
		dob.add(new dateofbirth(22,07,1991));
		dob.add(new dateofbirth(10,06,1985));
		for(int i=0;i<dob.size();i++) {
			int y=dob.get(i).getyear();
			if(y%400==0 || y%100==0 || y%4==0) {
				System.out.println(dob.get(i)+" : Born in Leap Year.");
			}else {
				System.out.println(dob.get(i)+" : Not Born in Leap Year.");
			}
		}

	}

}
