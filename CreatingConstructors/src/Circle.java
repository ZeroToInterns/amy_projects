
public class Circle {
	
	private static double radius;
	
	public double computeArea(double radius) {
		double pi = 3.14;
		double area = pi*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		Circle circleOne = new Circle();
		circleOne.radius = 5.0;

		Circle circleTwo = new Circle();
		System.out.println(circleTwo.radius);
	}

}
