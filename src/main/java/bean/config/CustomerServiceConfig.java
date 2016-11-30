package bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import bean.CustomerService;
import bean.CustomerServiceImpl;
   
@Configuration
public class CustomerServiceConfig {
 
    @Bean(name="configCustomerService")
    @Description("This is a sample HelloWorld Bean")
    public CustomerService helloWorld() {
        return new CustomerServiceImpl();
    }
 
}