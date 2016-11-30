package bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.CustomerService;
 
public class AppMainXml {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

		CustomerService custA = (CustomerService) context.getBean("customerService");
		custA.setHello("Message by custA");
		System.out.println("Message : " + custA.getHello());

		// retrieve it again
		CustomerService custB = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + custB.getHello());
	}

}