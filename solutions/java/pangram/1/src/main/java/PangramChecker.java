import java.util.Arrays;

public class PangramChecker {

	public boolean isPangram(String input) {
		String mask = "a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+";

		input = input.replaceAll("[\\s_0-9\"'!?.]+", "").toLowerCase();

		char[] inputAsArray = input.toCharArray();
		Arrays.sort(inputAsArray);
		input = new String(inputAsArray);
		return input.matches(mask);
	}

}
