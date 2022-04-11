package spring_core_q3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_q3 {
	public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("q3.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");

        System.out.println(controller.getBalance(1));
        System.out.println(controller.deposit(1,7000));
        System.out.println("*****");
        System.out.println(controller.withdraw(1,7000));
        System.out.println(controller.getBalance(1));
        System.out.println("/////");
        System.out.println(controller.fundTransfer(1,2,7000));
        System.out.println(controller.getBalance(1));
        System.out.println(controller.getBalance(2));
        context.close();
       
    }
}
