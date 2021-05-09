package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealCustomer(Customer customer);
}
