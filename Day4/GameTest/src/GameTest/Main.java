package GameTest;

import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.EdevletManager;
import Concretes.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Gürkan","Sönmez","2000");
		Customer customer2 = new Customer(2,"Selim","Özdemir","2000");
		Customer customer3 = new Customer(3,"Furkan","Karahan","2000");
		
		CustomerManager customerManager = new CustomerManager();
		EdevletManager edevletManager = new EdevletManager();
		
		Game game1= new Game(1,"Assasins Creed Origins",50,10);
		Game game2= new Game(2,"Counter Strike 1.6",20,10);
		Game game3= new Game(3,"Rocket League",35,10);
		
		GameManager gameManager= new GameManager();
		
		Campaign campaign1 =new Campaign(1,"Bahar Temizliði Kampanyasý",10);
		Campaign campaign2 =new Campaign(2,"Kýþ Mevsimi Kampanyasý",15);
		Campaign campaign3 = new Campaign(3,"Yýlbaþý Kampanyasý",20);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		
		customerManager.add(customer1);
		customerManager.add(customer2);
		customerManager.add(customer3);
		
		edevletManager.checkPerson(customer1);
		edevletManager.checkPerson(customer2);
		edevletManager.checkPerson(customer3);
		
		gameManager.sell(game3, customer3, campaign3);
		gameManager.sell(game2, customer2, campaign2);
		gameManager.sell(game1, customer1, campaign1);
		
		
		
		
		
	}
	
}
