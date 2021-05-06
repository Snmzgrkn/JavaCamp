package Concretes;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi : " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi : " + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri Güncellendi : " + customer.getFirstName());
	}

}
