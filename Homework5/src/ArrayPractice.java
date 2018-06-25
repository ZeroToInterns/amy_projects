
public class ArrayPractice {
	
	private int[] list;

	//constructor
	public ArrayPractice() {
		list = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	}
	
	//sum all the values of an array
	public int sum() {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		return sum;
	}
	
	//calculate the average of the values in the array
	public double average() {
		int theAverage = sum() / list.length;
		return theAverage;
	}
	
	//creates a 2D array
	public int[][] create2DArray(int numberOfRows, int numberOfColumns){
		int[][] new2DArray = new int[numberOfRows][numberOfColumns];
		return new2DArray;
	}
	
	//returns the maximum value in the array
	public int getMax() {
		int max = 0;
		for (int num: list) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	//returns the maximum value in a 2D array
	public int find2DMax(int[][] myArray) {
		int max = 0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (myArray[i][j] > max) {
					max = myArray[i][j];
				}
			}
		}
		return max;
	}
	
}
