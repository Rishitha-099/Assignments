package spring_core_q5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_q5 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q5.xml");
		Shape s = (Shape) context.getBean("Dot");
		s.draw();
		Shape si = (Shape) context.getBean("Circle");
		si.draw();
		context.close();
}
}
