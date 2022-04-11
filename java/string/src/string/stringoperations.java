package string;

public class stringoperations {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of strings which are stored in heap memory";
		String strlower= str.toLowerCase();
		System.out.println(strlower);
		String strUpper= str.toUpperCase();
		System.out.println(strUpper);
		String strReplacestring=str.replace('a','$');
		System.out.println(strReplacestring);
		System.out.println(str.contains("collection"));
		String str1="java String pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equals(str1));
		System.out.println(str==str1);

	}

}
