package Annotation_assignments;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.junit.Test;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface test{
	}
class method{
	@Test
	void run() {
		System.out.println("Hello");
	}
}
public class Q1 {
	public static void main(String[] args) {
		method x=new method();
		x.run();
	}

}
