
public class Tester {
	
	private static String determineGender(char gender) {
		String result;
		if(gender == 'M') {
			result = "Its a Male";
		}
		else if(gender == 'F') {
			result = "Its a Female";
		}
		else {
			result = "Error: Invalid";
		}
		return result;
		
	}
	
	public static void chooseRoom(String newAnimal, boolean isSick, char gender) {
		if (isSick) {
			System.out.println("We cannot accept this animal");
		}
		//not sick
		else {
			//check if its a dog
			if(newAnimal.equals("dog") || newAnimal.equals("Dog")) {
				System.out.println(determineGender(gender) + " Dog");
			}
			
			//check if its a cat
			else if (newAnimal.equals("cat") || newAnimal.equals("Cat")) {
				System.out.println(determineGender(gender) + " Cat");
			}
			
			//check if its a zebra
			else if (newAnimal.equals("zebra") || newAnimal.equals("Zebra")) {
				System.out.println(determineGender(gender) + " Zebra");
			}
			
			//I dont care
			else {
				System.out.println("We don't accept that animal");
			}
		}
	}

	public static void main(String[] args) {
		
		chooseRoom("Dog", false, 'M');
		chooseRoom("Dog", false, 'M');
//		chooseRoom("Cat", false, 'F');
		
//		int myInt = 10;
//		double mySecondInt = 3.0;
//		double result = myInt * mySecondInt;
//		System.out.println(result);
		
//		double temperature = 77.5;
//		
//		if (temperature >= 77.5 && temperature <= 120) {
//			System.out.println("Its Hot");
//		}
//		else if (temperature >= 15 && temperature < 77.5) {
//			System.out.println("Its livable");
//		}
//		else {
//			System.out.println("Screw this");
//		}
		
	}

}
