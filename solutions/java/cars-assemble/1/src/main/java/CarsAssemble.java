public class CarsAssemble {

	public double productionRatePerHour(int speed) {
		double production = speed * 221.0;
		if (speed <= 4) {
			return production;
		} else if (speed <= 8) {
			return production * 0.9;
		} else if (speed == 9) {
			return production * 0.8;
		} else return production * 0.77;
	}

	public int workingItemsPerMinute(int speed) {
		return (int) productionRatePerHour(speed) / 60;
	}
}
