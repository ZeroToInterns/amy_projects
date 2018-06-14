import java.util.Scanner;
public class LoopyFun {

	//takes an integer parameter and returns the number of unique ways we could form a line of that many people
	public int getPermutationCount(int n) {
		if (n <= 0) {
			return 0;
		}
		int permutationCount = 1;
		for (int i = 1; i <= n; i++) {
			permutationCount = permutationCount * i;
		}
		return permutationCount;
	}
	
	//removes duplicates from a String
	public String removeDuplicates(String word) {
		if (word.length() == 0) {
			throw new IndexOutOfBoundsException("It is an empty string");
		}
		String finalWord = word.substring(0,1);
		for (int i = 1; i < word.length(); i++) {
			if (!finalWord.contains(word.substring(i, i + 1))) {
				finalWord += word.substring(i, i + 1);
			}
		}
		return finalWord;
	}
	
	//calculates the sum of the following series for n terms, returns 0 if n is not positive
	public double sumSeries(int n) {
		if (n <= 0) {
			return 0;
		}
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += 4 / Math.pow(2, i);
		}
		return sum;
	}
	
	//asks the user for n integers and returns the product of the integers
	public int product(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n < 0) {
			return -1;
		}
		Scanner scan = new Scanner(System.in);
		int product = 1;
		int count = 1;
		while (count <= n) {
			System.out.print("Enter integer " + count + ": ");
			product = product * scan.nextInt();
			count++;		
		}
		return product;
	}
	
	//gets the largest integer x to makes the expression less than the value given
	public int largestPowerLessThan(int value) {
		int largestInt = 0;
		int count = 0;
		if (Math.pow(2, count) > value) {
			return -1;
		}
		while (Math.pow(2, count ) < value) {
			largestInt = count;
			count++;
		}
		return largestInt;
	}
	
	//return the sum of all the positive odd numbers less than the given value
	public int sumOdd(int value) {
		int sum = 0;
		for (int i = 1; i < value; i = i + 2) {
			if (i < value ) {
				sum += i;
			}
		}
		return sum;
	}
	
	//gets the number of e's in the word, either upper or lower case
	public int getECount(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i, i + 1).equalsIgnoreCase("e")) {
				count++;
			}
		}
		return count;
	}
}