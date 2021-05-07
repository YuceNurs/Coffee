package Abstract;

import Entities.Customer;
import java.rmi.RemoteException;


public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public  boolean  save(Customer customer) {
		
		System.out.println("Kaydedildi : "+ customer.getFirstName());
		return true;
		
	}

}
