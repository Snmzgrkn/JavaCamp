import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager= new NeroCustomerManager(new MernisServiceAdapter());

		Customer customer = new Customer();
		customer.FirstName ="Gürkan";
		customer.LastName = "Sönmez";
		customer.Id = 1;
		customer.NatioanlityId = "999999999";
		customer.DateOfBirth = 9999;
		
		
		customerManager.Save(customer);
	}

}
