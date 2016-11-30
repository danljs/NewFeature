package bean.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import bean.CustomerService;
 
public class AppMainConfig {
 
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(CustomerServiceConfig.class);
        CustomerService bean = (CustomerService) context.getBean("configCustomerService");
        bean.sayHello("Spring 4");
        context.close();
    }
 
}