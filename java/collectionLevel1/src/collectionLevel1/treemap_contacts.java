package collectionLevel1;
import java.util.TreeMap;
public class treemap_contacts {

	public static void main(String[] args) {
		TreeMap<Long,String> contacts=new TreeMap();
		contacts.put((long)987654321,"Rishitha");
		contacts.put((long)765432198,"Siri");
		contacts.put((long)543219876,"Hasini");
		System.out.println(contacts.keySet());
		System.out.println(contacts.values());
		System.out.println(contacts);

	}

}
