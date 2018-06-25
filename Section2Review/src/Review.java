import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Review {
	
	public static ArrayList<Integer> reverseArray(ArrayList<Integer> list){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = list.size() - 1; i >= 0; i-- ) {
			newList.add(list.get(i));
		}
		return newList;
	}
	
	public static int[] removeDuplicates(int[] list){
		int[] newList = new int[list.length];
		int count = 0;
		
//		//loops through each element in the given list
//		for (int i = 0; i < list.length; i++) {
//			boolean notFound = true;
//			
//			//loops through the newList for the element
//			for (int j = 0; j < newList.length; j++) {
//				if (list[i] == newList[j]){
//					notFound = false;
//				}
//			}
//			
//			//add the element to newList if the element does not exist in newList
//			if (notFound) {
//				newList[count] = list[i];
//				count++;
//			}
//		}
//		return newList;
		
		//alternative way using HashSet
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.length; i++) {
			if (set.add(list[i])) {
				newList[count] = list[i];
				count++;
			}
		}
		return newList;
	}
	
	//returns the most frequently appearing integer in the array
	public static int countMostFrequent(int[] list) {
		int mostCount = 0;
		int mostFrequentlyAppearingInt = 0;
		
		//loops 50 times checking how many times each integer from 0 to 50 appears in the array
		for (int i = 0; i <= 50; i++) {
			int count = 0;
			
			for (int j = 0; j < list.length; j++) {
				if (list[j] == i) {
					count++;
				}
			}
			
			//changes mostFrequentlyAppearingInt to the current integer if it appears more frequently
			if (count > mostCount) {
				mostCount = count;
				mostFrequentlyAppearingInt = i;
			}
		}
		return mostFrequentlyAppearingInt;
	}
}
