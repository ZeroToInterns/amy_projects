import java.util.ArrayList;

public class ArrayListPractice {
	
	//insert an element into the array list at the first position
	public static void insertFirst(ArrayList<String> list, String color) {
		list.add(0, color);
	}
	
	//insert an element into the array list at the second to last position
	public static void addSecondToLast(ArrayList<String> list, String color) {
		list.add(list.size() - 1, color);
	}
	
	//counts the number of how many times the element specified exist in the array list
	public static int colorCount(ArrayList<String> list, String color) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(color)) {
				count++;
			}
		}
		return count;
	}
	
	//replaces all occurrences of the first parameter in the array list with the second parameter
	public static void replace(String colorToReplace, String colorToReplaceWith, ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(colorToReplace)) {
				list.set(i, colorToReplaceWith);
			}
		}
	}
}