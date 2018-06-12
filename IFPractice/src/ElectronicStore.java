
public class ElectronicStore {

	public static double getPrice(String electronic, boolean damage) {
		double price;
		if (electronic.equals("IPad")) {
			price = 300.99;
		}
		else if (electronic.equals("Macbook")) {
			price = 1000.99;
		}
		else if (electronic.equals("TV")) {
			price = 800.99;
		}
		else if (electronic.equals("Phone")) {
			price = 900.99;
		}
		else if (electronic.equals("Charger")) {
			price = 10.99;
		}
		else {
			price = 0;
		}
		if (damage) {
			price = price / 2;
		}
		return price;
	}
}