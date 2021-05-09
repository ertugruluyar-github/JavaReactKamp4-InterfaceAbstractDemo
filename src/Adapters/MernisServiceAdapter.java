package Adapters;

import javax.xml.rpc.ServiceException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		KPSPublicLocator locator = new KPSPublicLocator();
		try {
			KPSPublicSoap client = locator.getKPSPublicSoap();
			return client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear()
					);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
