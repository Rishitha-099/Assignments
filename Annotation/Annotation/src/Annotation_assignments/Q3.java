package Annotation_assignments;
import java.lang.annotation.*;  
import java.lang.reflect.*; 
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD) 
@interface val{
	int seq();
}
@interface order{
	int value();
}
class annotclass{
	@order(value=1)
	@val(seq=2)
	public void method1() {
		System.out.println("One");
	}
	@order(value=2)
	@val(seq=1)
	public void method2() {
		System.out.println("two");
	}
	@order(value=3)
	@val(seq=3)
	public void method3() {
		System.out.println("three");
	}
}
public class Q3 {
	public static void main(String args[])throws Exception{
		annotclass x=new annotclass();
		Method m=x.getClass().getMethod("method1");
		Method n=x.getClass().getMethod("method2");
		Method o=x.getClass().getMethod("method3");
		val manno=m.getAnnotation(val.class);
		val ma=n.getAnnotation(val.class);
		val no=o.getAnnotation(val.class);
		System.out.println(manno);
		System.out.println(ma);
		System.out.println(no);
		
		
	}

}
