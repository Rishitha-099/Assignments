package spring_core_q4;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_q4 {
	public static void main(String[] args) {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q4.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");

        System.out.println(controller.getBalance(1));
        System.out.println(controller.deposit(1,7000));
        System.out.println("*****");
        System.out.println(controller.withdraw(1,5000));
        System.out.println(controller.getBalance(1));
        
        System.out.println("/////");
        System.out.println(controller.fundTransfer(1,2,6000));
        System.out.println(controller.getBalance(1));
        System.out.println(controller.getBalance(2));
        context.close();

    }

}
