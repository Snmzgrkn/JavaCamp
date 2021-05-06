package Concretes;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("M��teri Eklendi : " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi : " + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri G�ncellendi : " + customer.getFirstName());
	}

}
