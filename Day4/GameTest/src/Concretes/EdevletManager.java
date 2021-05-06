package Concretes;

import Abstract.EdevletService;
import Entities.Customer;

public class EdevletManager implements EdevletService{

	@Override
	public boolean checkPerson(Customer customer) {
		System.out.println("Kulanýcý Doðrulandý.");
		return true;
		
	}

}
