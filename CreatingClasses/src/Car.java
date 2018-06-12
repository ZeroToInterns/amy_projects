
public class Car extends Vehicle{
	
	//instance variable
	private String color = "Red";
	
	public static void main(String[] args) {
		//Creating a new car named myCar from the Car Class blueprint
		Car myCar = new Car();
		//using the move function from myCar's superclass called Vehicle
		myCar.move();
		
	}

	@Override
	public void move() {
		System.out.println("The car moved 10 feet");
	}
	
	public void drive() {
		System.out.println("The car has moved 5 feet");
	}
}
