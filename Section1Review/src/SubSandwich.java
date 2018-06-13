
public class SubSandwich {

	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	
	private int type;
	private int size;
	private boolean extraMeat;
	
	//constructor
	public SubSandwich(int theType, int theSize, boolean extraMeat) {
		//if the type is not chicken or pastrami, sets the type to pastrami
		if (theType != CHICKEN && theType != PASTRAMI) {
			this.type = PASTRAMI;
		}
		else {
			this.type = theType;
		}
		//if size is not 6 or 12, sets the size to 12
		if (theSize != 6 && theSize != 12) {
			size = 12;
		}
		else {
			this.size = theSize;
		}
		this.extraMeat = extraMeat;
	}
	
	//gets the size of the sub
	public int getSize() {
		return size;
	}
	
	//sets a new size for the sub
	public void setSize(int newSize) {
		//change the size only if newSize is 6 or 12
		if (newSize == 6 || newSize == 12) {
			size = newSize;
		}
	}
	
	//returns true if there is extra meat, otherwise false
	public boolean isExtraMeat() {
		return extraMeat;
	}
	
	//gets the type of SubSandwich as a string: either "chicken" or "pastrami"
	public String getType(){
		if (type == CHICKEN) {
			return "chicken";
		}
		else {
			return "pastrami";
		}
	}
	
	//gets the cost of this SubSandwich
	public double getCost() {
		double cost = 0;
		if (type == CHICKEN) {
			if (size == 6) {
				cost += 5.50;
			}
			else {
				cost += 8.95;
			}
		}
		else {
			if (size == 6) {
				cost += 6.95;
			}
			else {
				cost += 9.50;
			}
		}
		if (extraMeat) {
			cost += COST_FOR_EXTRA_MEAT;
		}
		return cost;
	}
}
