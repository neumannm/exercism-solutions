class ReverseString {

	String reverse(String inputString) {
		char[] result = new char[inputString.length()];
		int idx = inputString.length()-1;
		for(char c : inputString.toCharArray()) {
			result[idx] = c;
			idx--;
		}
		return new String(result);
	}

}