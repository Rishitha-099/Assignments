package collectionLevel1;

import java.util.HashSet;

public class product_objects {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("Nike");
		h.add("Adidas");
		h.add("New Balance");
		h.add("ASICS");
		h.add("PUMA");
		h.add("Skechers");
		h.add("Fila");
		h.add("Bata");
		h.add("Burberry");
		h.add("VF Corporation");
		System.out.println("Original");
		System.out.println(h);
		System.out.println(h.size());
		h.add("Nike");
		h.add("Bata");
		System.out.println("After adding duplicate elements");
		System.out.println("h");
		System.out.println(h.size());
		
    
	}

}
