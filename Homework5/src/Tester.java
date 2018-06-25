
public class Tester {

	public static void main(String[] args) {
		ArrayPractice list = new ArrayPractice();
		
		//prints the sum of all the value in list
		System.out.println(list.sum());
		
		//prints the average of the values in list
		System.out.println(list.average());
		
		//create a 2D array
		System.out.println(list.create2DArray(9, 9));
		
		//print the max value in list
		System.out.println(list.getMax());
		
	}
}