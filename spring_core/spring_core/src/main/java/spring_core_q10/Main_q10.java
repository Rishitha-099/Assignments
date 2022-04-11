package spring_core_q10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_q10 {
	 public static void main( String[] args ){
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("q10.xml");
		    hi c = (hi) Q10.getBean("c");
		    c.hello();
		    context.close(); 
		  }

}
