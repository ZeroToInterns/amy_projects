
public class Tester {

	public static void main(String[] args) {

		BattleShip game1 = new BattleShip();
		game1.printGrid();
		
		game1.placeFishingBoat(0, 0);
		game1.printGrid();
		
//		game1.placeCarrierBoat(10, 10, "vertical");
		
		game1.attack(0, 0);
		game1.attack(6, 7);
		game1.attack(11, 10);
	}

}
