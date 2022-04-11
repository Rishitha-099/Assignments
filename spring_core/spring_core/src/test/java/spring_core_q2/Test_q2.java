package spring_core_q2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_q2 {

	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q2.xml");	      
	    Question qList= (Question) context.getBean("q2List");   
	    ArrayList <String> al = new ArrayList<String>();
	    al.add("Pink");
	    al.add("Blue");
	    Question que = new Question(1,"What is your favorite color?",al);
	    assertEquals(qList.toString(), que.toString());
	    context.close();

	}

}
