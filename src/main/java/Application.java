import com.pluralsight.model.Customer;
import com.pluralsight.model.DefaultMessage;
import com.pluralsight.model.Message;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Application
 */
public class Application {


    public static void main(String[] args)
    {
        // hardcoded ref
         //CustomerService service = new CustomerServiceImpl();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final String[] beanDefinitionNames = appContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("Bean name ["+i+"] = " + beanDefinitionName);
        };
        final String customerServiceBeanName = appContext.containsBean("customerServiceBean") ? "customerServiceBean" : "customerService";
        CustomerService service = appContext.getBean(customerServiceBeanName, CustomerService.class);

        System.out.println("app name = " + appContext.getApplicationName());
        System.out.println("bean for customer service = " + appContext.getBean(customerServiceBeanName, CustomerService.class));
        String customerRepositoryBean =  appContext.containsBean("customerRepositoryBean") ? "customerRepositoryBean" : "customerRepository";
        customerRepositoryBean = "foo";
        System.out.println("bean for customer repos= " + appContext.getBean(customerRepositoryBean, CustomerRepository.class));
        System.out.println("bean for message repos= " + appContext.getBean("message", DefaultMessage.class));

        final List<Customer> customers = service.findAll();
        for (Customer customer : customers) {
            System.out.println("Name : "+ customer.getFirstName());
        }

        Message message = appContext.getBean("message", Message.class);
        System.out.println("Message = " + message.getMessage());

        Message defaultMessage = (Message) appContext.getBean("message");

        System.out.println("message='" + defaultMessage.getMessage() + "'");
        System.out.println("Message count = " + message.getCOUNTER());
    }

}
// Config code can make testing hard.
//App -> instance of CusObj -> Repos