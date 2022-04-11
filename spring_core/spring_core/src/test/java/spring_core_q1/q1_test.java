package spring_core_q1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class q1_test {
	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q1.xml");
		Customer ct = (Customer) context.getBean("Customer");
		Address s1 = (Address) context.getBean("Address"); 
		long l=  9876543210L;
		Customer c2 = new Customer(3,"Rishitha",l,s1);
		assertEquals(c2.toString(),ct.toString());
		context.close();
	}

	

	

}
