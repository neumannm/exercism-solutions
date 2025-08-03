class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numberAsString = Integer.toString(numberToCheck);
		int sum = numberAsString.chars().map(i -> Character.digit(i, 10)).map(c -> (int)Math.pow(c, numberAsString.length())).sum();
		return sum == numberToCheck;
	}

}