package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		return true;
	}

}
