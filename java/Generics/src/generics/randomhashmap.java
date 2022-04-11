package generics;
import java.util.*;


public class randomhashmap {

	public static void main(String[] args) {
		HashMap<Integer,Double> map=new HashMap<Integer,Double>();
		map.put(5,5.0);
		map.put(10,10.0);
		map.put(15,15.0);
		map.put(20,20.0);
		map.put(25,25.0);
		map.put(30,30.0);
		map.put(35,35.0);
		map.put(40,40.0);
		map.put(45,45.0);
		map.put(50,50.0);
		for(Map.Entry<Integer, Double>e:map.entrySet())
			System.out.println("Key sn: "+e.getKey()+" Value : "+e.getValue());

	}

}
