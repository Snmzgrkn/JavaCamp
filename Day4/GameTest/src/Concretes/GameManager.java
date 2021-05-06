package Concretes;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService{
	
	@Override
	public void sell(Game game,Customer customer,Campaign campaign) {
		System.out.println("------------------------------------------------");
		System.out.println(game.getName() + " oyunu " + customer.getFirstName() +
				" adlý kullanýcý tarafýndan satýn alýndý.");
		System.out.println("Uygulanan Kampanya : " + campaign.getName() );
		System.out.println("Oyun Fiyatý : " + game.getUnitPrice());
		System.out.println("Oyun Ýndirimli Fiyatý :" + 
		(game.getUnitPrice()- campaign.getDiscount()));
		System.out.println("------------------------------------------------");
	}

}
