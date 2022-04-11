package spring_core_q10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class hi{
	void hello() {
		System.out.println("Hi,Hello");
	}
}
public class Q10 implements ApplicationContextAware{
	private static ApplicationContext context;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
		context = applicationContext;
	}
	public static Object getBean(String beanName){
		System.out.println(beanName);
		return context.getBean(beanName);
	}

}
