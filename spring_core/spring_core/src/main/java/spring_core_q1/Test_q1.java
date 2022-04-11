package spring_core_q1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_q1 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q1.xml");
		Customer ct = (Customer) context.getBean("Customer");
		System.out.println(ct);
		context.close();
	}

}
