package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getBirthOfDate().getYear());
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		}
		// TODO Auto-generated method stub
		return result;
	}

}
