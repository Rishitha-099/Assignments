package spring_core_q2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_q2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q2.xml");	
		
	    Question qList= (Question) context.getBean("q2List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.DisplayAnswer1(); 
	   
	    Question qset= (Question) context.getBean("q2Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.DisplayAnswer1(); 
	    
	    Question qMap= (Question) context.getBean("q2Map");  
	    System.out.println("\nMap Injection\n"+qMap.toString());
	    qMap.DisplayAnswer(); 
	    context.close();
	}

}
