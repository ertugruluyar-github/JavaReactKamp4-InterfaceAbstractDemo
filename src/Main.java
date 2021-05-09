import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(0, "Fatih", "Uyar", LocalDate.of(2006, 1, 1), "10605133256");
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
	}
	
}
