package Concretes;

import Abstract.EdevletService;
import Entities.Customer;

public class EdevletManager implements EdevletService{

	@Override
	public boolean checkPerson(Customer customer) {
		System.out.println("Kulan�c� Do�ruland�.");
		return true;
		
	}

}
