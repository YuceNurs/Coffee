package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService {
	

	private CustomerCheckService customerCheckService;
	
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
			if(customerCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);
		}
		else {
			System.out.println("Not a person valid:"+" "+ customer.getFirstName());
		}
		return true;
	}

}

