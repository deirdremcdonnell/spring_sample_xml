import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
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
        CustomerService service = appContext.getBean("customerServiceBean", CustomerService.class);

        System.out.println("app name = " + appContext.getApplicationName());
        System.out.println("bean for customer service = " + appContext.getBean("customerServiceBean", CustomerService.class));
        System.out.println("bean for customer repos= " + appContext.getBean("customerRepositoryBean", CustomerRepository.class));
        final List<Customer> customers = service.findAll();
        for (Customer customer : customers) {
            System.out.println("Name : "+ customer.getFirstName());
        }
    }

}
// Config code can make testing hard.
//App -> instance of CusObj -> Repos