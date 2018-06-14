
public class ElectricCar {

	private int maxRange;
	private int currentRange;
	private String make;
	
	//constructor
	public ElectricCar(String make, int maxRange) {
		this.make = make;
		this.maxRange = maxRange;
		this.currentRange = 0;
	}
	
	//charges the ElectricCar to its maximum range
	public void charge() {
		this.currentRange = maxRange;
	}
	
	//drives the car the given distance
	public void drive(int miles) {
		if (miles > currentRange) {
			System.out.println("You can't drive that far");
		}
		else{
			this.currentRange -= miles;
		}
	}
	
	//gets the make of the ElectricCar
	public String getMake() {
		return make;
	}
	
	//gets the number of miles the car can go
	public int getCurrentRange() {
		return currentRange;
	}
	
	//gets the maximum number of miles the car can go when fully charged
	public int getMaxRange() {
		return maxRange;
	}
}
