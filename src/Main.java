import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		 

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setNationalityId("12312312332");
		customer1.setFirstName("Nur");
		customer1.setLastName("yüce");
		customer1.setDateOfBirth(2000);
		
		
		CustomerCheckService customerCheckService = (CustomerCheckService) new StarbucksCustomerManager(new MernisServiceAdapter());
		
		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.save(customer1);
		
	}
		


}
