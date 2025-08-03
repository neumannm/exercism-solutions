import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	String sortedString;
	private String string;

	public Anagram(String string) {
		this.string = string;
		this.sortedString = rearrangeCharacters(string);
	}

	public List<String> match(List<String> stringList) {
		List<String> result = stringList.stream().
				filter(s -> !s.equalsIgnoreCase(string)).
				filter(s -> matches(rearrangeCharacters(s), sortedString))
				.collect(Collectors.toList());
		return result;
	}

	private boolean matches(String s1, String s2) {
		return s1.equalsIgnoreCase(s2);
	}

	private String rearrangeCharacters(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
