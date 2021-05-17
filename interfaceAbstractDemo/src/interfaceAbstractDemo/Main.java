package interfaceAbstractDemo;



import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
	
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	customerManager.Save(new Customer(1, "Merve", "ALKAN", LocalDate.of(1998, 6, 7),"25623121320"));
	
	BaseCustomerManager customerManager2 = new NeroCustomerManager();
	customerManager2.Save(new Customer(2, "Esra" , "ALKAN", LocalDate.of(2000, 7, 22), "21565212360"));

	}

}
