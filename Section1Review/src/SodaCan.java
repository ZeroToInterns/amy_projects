
public class SodaCan implements Comparable<SodaCan>{

	public static final double DEFAULT_RADIUS = 1.2109;
	public static final double DEFAULT_HEIGHT = 4.704;
	public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	    
    private double radius;
	private double height;
	private double content;
	
	//default constructor
	public SodaCan() {
		radius = DEFAULT_RADIUS;
		height = DEFAULT_HEIGHT;
		content = Math.PI * radius * radius * height * FLUID_OUNCES_PER_CUBIC_INCHES;
	}
	
	//constructor with given radius and height
	public SodaCan(double theRadius, double theHeight) {
		if (theRadius < 0 || theHeight < 0) {
			this.radius = DEFAULT_RADIUS;
			this.height = DEFAULT_HEIGHT;
		}
		else {
			this.radius = theRadius;
			this.height = theHeight;
		}
		content = Math.PI * radius * radius * height * FLUID_OUNCES_PER_CUBIC_INCHES;
	}
	
	//gets the radius of the SodaCan
	public double getRadius() {
		return radius;
	}
	
	//gets the height of the SodaCan
	public double getHeight() {
		return height;
	}
	
	//simulates drinking from SodaCan by subtracting fluidOunces from the contents
	public void drink(double fluidOunces) {
		if (fluidOunces > content) {
			System.out.println("You don't have enought soda to drink that much");
		}
		else {
			content -= fluidOunces;
		}
	}
	
	//gets the fl. oz. of soda remaining in the SodaCan
	public double getContents() {
		return content;
	}
	
	@Override
	//compares the current content of the SodaCan to another SodaCan
	public int compareTo(SodaCan otherCan) {
		if (content > otherCan.content) {
			return 1;
		}
		else if (content < otherCan.content) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
