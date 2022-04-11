package Annotation_assignments;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface details{
	int AuthorID();
	String Author()default"None";
	String Supervisor() default"None";
	String Date();
	String Time();
	String Version();
	String Description() default"NA";
	
}
@details(AuthorID=2014,Author="Rishitha",Date="24-02-2022",Time="9:25",Version="Java 8")
class msg{
	void msgin() {
		System.out.println("Hello");
	}
}
public class Q2 {
	public static void main(String[] args) {
		msg x = new msg();
		x.msgin();
	    @SuppressWarnings("rawtypes")
		Class a = x.getClass();
	    @SuppressWarnings("unchecked")
		java.lang.annotation.Annotation q = a.getAnnotation(details.class);
	    details i = (details)q;
	    System.out.println(i);

	}

}
