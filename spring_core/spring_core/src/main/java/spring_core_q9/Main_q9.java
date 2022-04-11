package spring_core_q9;

import java.util.Collection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class q9 implements InitializingBean,DisposableBean {
	int Questionid;
	String Question;
	Collection<String> answers;

	public void init() throws Exception
    {
        System.out.println( "Bean Q9 has been instantiated ");
    }
	

	public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed and I'm the destroy() method");
    }
	
	q9(int questionid, String question, Collection<String> answers) {
		Questionid = questionid;
		Question = question;
		this.answers = answers;
	}
	

	void Displayanswer(){
	System.out.println(answers);
	}


	@Override
	public String toString() {
		return "Q9 [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
	}


	public void afterPropertiesSet() throws Exception {
		 System.out.println(
		            "Bean Coustmer has been instantiated and I'm the init() method");
		    }

}

public class Main_q9 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q9.xml");	      
		
	    q9 qList= (q9) context.getBean("q9List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.Displayanswer(); 
	   
	    q9 qset= (q9) context.getBean("q9Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.Displayanswer(); 
	    context.close();
	}

}
