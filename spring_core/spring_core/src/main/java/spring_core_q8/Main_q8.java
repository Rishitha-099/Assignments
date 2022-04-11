package spring_core_q8;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class q8 implements InitializingBean,DisposableBean{
	int Questionid;
	String Question;
	Collection<String> answers;
	@javax.annotation.PreDestroy
    private void PreDestroy() {
		System.out.println("PreDestroy Invoked");}
	
	@PostConstruct
    private void postConstruct() {
		System.out.println("postConstruct Invoked");
		}
	public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed and I'm the destroy() method");
    }
	
	q8(int questionid, String question, Collection<String> answers) {
		Questionid = questionid;
		Question = question;
		this.answers = answers;
	}
	void Displayanswer(){
		System.out.println(answers);
		}

	@Override
	public String toString() {
		return "q8[Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
	}
	public void afterPropertiesSet() throws Exception {
		 System.out.println(
		            "Bean Coustmer has been instantiated and I'm the init() method");
		    }

	
}
public class Main_q8 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q8.xml");	      
	    q8 qList= (q8) context.getBean("q8List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.Displayanswer(); 

	    q8 qset= (q8) context.getBean("q8Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.Displayanswer(); 
	    context.close();
	}

}
