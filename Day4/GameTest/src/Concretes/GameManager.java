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
				" adl� kullan�c� taraf�ndan sat�n al�nd�.");
		System.out.println("Uygulanan Kampanya : " + campaign.getName() );
		System.out.println("Oyun Fiyat� : " + game.getUnitPrice());
		System.out.println("Oyun �ndirimli Fiyat� :" + 
		(game.getUnitPrice()- campaign.getDiscount()));
		System.out.println("------------------------------------------------");
	}

}
