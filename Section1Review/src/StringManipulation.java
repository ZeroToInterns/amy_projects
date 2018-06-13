import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//asks the user to enter their full name
		System.out.print("Enter your full name: ");
		String fullName = scan.nextLine();
		
		//prints the first letter of the name
		System.out.println(fullName.substring(0, 1));
		
		//print first name
		int indexOfFirstSpace = fullName.indexOf(" ");
		System.out.println(fullName.substring(0, indexOfFirstSpace));
		
		//print the rest of the name
		System.out.println(fullName.substring(indexOfFirstSpace + 1, fullName.length()));
		
		//prints 3 characters of the name starting at index 4
		System.out.println(fullName.substring(4, 7));
	}

}
