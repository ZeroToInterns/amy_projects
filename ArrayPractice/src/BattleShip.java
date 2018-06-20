
public class BattleShip {

	private boolean[][] grid;
	
	public BattleShip() {
		grid = new boolean[10][10];
	}
	
	public void printGrid() {
		System.out.println("Grid:");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//places a 1 unit fishing boat at a location
	public void placeFishingBoat(int x, int y) {
		grid[y][x] = true;
	}
	
	//places a 3 unit long boat on the grid
	public void placeCarrierBoat(int x, int y, String orientation) {
		try {
			if (orientation.equals("vertical")) {
				grid[y + 0][x] = true;
				grid[y + 1][x] = true;
				grid[y + 2][x] = true;
			}
			else if (orientation.equals("horizontal")){
				grid[y][x + 0] = true;
				grid[y][x + 1] = true;
				grid[y][x + 2] = true;
			}
			else {
				System.out.println("Please put in a valid orientation");
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Cannot place boat at that spot");
		}
	}
	
	public void attack(int x, int y) {
		try {
			if (grid[y][x]) {
				System.out.println("Hit!");
			}
			else if (!grid[y][x]){
				System.out.println("Missed!");
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Cannot attack that spot");
		}
	}
	
}
