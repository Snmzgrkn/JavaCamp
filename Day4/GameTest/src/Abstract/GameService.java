package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameService {
	void sell(Game game,Customer customer,Campaign campign);
}
