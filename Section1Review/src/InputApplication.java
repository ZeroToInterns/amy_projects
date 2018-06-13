import java.util.Scanner;
public class InputApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//asks user for their favorite dessert and prints the last letter of it
		System.out.print("Enter a your favorite dessert: ");
		String favoriteDessert = scan.nextLine();
		System.out.println(favoriteDessert.substring(favoriteDessert.length() - 1,  favoriteDessert.length()));
		
		//asks user for a double
		System.out.print("Enter a double: ");
		double aDouble = scan.nextDouble();
		
		//asks user for an integer
		System.out.print("Enter an integer: ");
		int integer = scan.nextInt();
		
		//prints the product of the double and integer 
		double product = aDouble * integer;
		System.out.println("Product: " + product);
		
		//prints the integer portion of the product
		int integerPortion = (int) product;
		System.out.println("Integer Portion: " + integerPortion);
	}

}
