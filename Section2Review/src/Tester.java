import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		//test reverseArray method
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(1);
		myList.add(1);
		myList.add(2);
		myList.add(6);
		myList.add(1);
		myList.add(9);
		myList.add(3);
		System.out.println(myList);
		System.out.println(Review.reverseArray(myList));		
		
		//test removeDuplicates method
		int[] intArray = new int[] {1, 2, 3, 4, 5, 1, 1, 2, 7, 3, 8, 1};
		int[] newArray = Review.removeDuplicates(intArray);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println("");
		
		//test countMostFrequent method
		int[] secondArray = new int[] {1, 49, 50, 0, 36, 45, 42, 33, 28, 22, 17, 15, 34, 23, 36, 41, 42, 36};
		System.out.println("Most frequently appearing integer: " + Review.countMostFrequent(secondArray));
		//Answer should be 36
	}

}
