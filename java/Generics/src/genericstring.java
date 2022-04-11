class Generic<K, V>
{
	K Key;
	V value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		this.Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class genericstring {

	public static void main(String[] args) {
		Generic<String, String> obj1=new Generic<>();
		obj1.setKey("1");
		obj1.setValue("Hello");
		Generic<String, java.util.Date> obj2=new Generic<>();
		obj2.setKey("Today is");
		obj2.setValue(new java.util.Date());
		System.out.println(obj1.getKey()+" "+obj1.getValue());
		System.out.println(obj2.getKey()+" "+obj2.getValue());
		

	}

}
