
public class Thermometer {
	private int temperature;

	public void raiseTemp() {
		if (temperature > 90) {
			//temperature is 91 or greater
			while (temperature > 90) {
				temperature--;
			}
		}
		else {
			//temperature is 90 or less
			while (temperature < 90) {
				temperature++;
			}
		}
	}
}
