import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Orange");
		colorList.add("Yellow");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add("Purple");
		colorList.add("Brown");
		colorList.add("Black");
		colorList.add("Gray");
		colorList.add("Yellow");
		
		//inserts Green into the array list at the first position
		ArrayListPractice.insertFirst(colorList, "Green");
		System.out.println(colorList.toString());
		
		//inserts Orange into the array list at the second to last position
		ArrayListPractice.addSecondToLast(colorList, "Orange");
		System.out.println(colorList.toString());
		
		//test colorCount
		System.out.println(ArrayListPractice.colorCount(colorList, "Yellow"));
		System.out.println(ArrayListPractice.colorCount(colorList, "Orange"));
		System.out.println(ArrayListPractice.colorCount(colorList, "Red"));
	
		//replace Yellow with Red in the array list
		ArrayListPractice.replace("Yellow", "Red", colorList);
		System.out.println(colorList.toString());
	}

}
