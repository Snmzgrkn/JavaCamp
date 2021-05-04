package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer gurkan = new Customer(1,"Gürkan","Sönmez");
		
		customerManager.add(gurkan);
		
	}

}
