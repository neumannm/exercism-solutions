import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator {

	private static final String VOWEL_PATTERN = "^([aeiou]|(xr)|(yt)).*";

	public String translate(String string) {
		String[] words = string.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			String translated = translateWord(word);
			builder.append(translated).append(" ");
		}
		return builder.toString().trim();
	}

	private String translateWord(String word) {
		if (word.isEmpty() || word.length() < 1) {
			return new String();
		}

		if (startsWithVowelSound(word)) {
			return word + "ay";
		}

		Pattern consonantPattern = Pattern.compile("^(qu|y|[^aeiouy]+?(qu)?)[aeiouy].*");
		Matcher consonantPatternMatcher = consonantPattern.matcher(word);

		if (consonantPatternMatcher.matches()) {
			String match = consonantPatternMatcher.group(1);
			String rest = word.substring(consonantPatternMatcher.end(1));

			return rest + match + "ay";
		}

		return null;
	}

	private boolean startsWithVowelSound(String string) {
		if (string.matches(VOWEL_PATTERN)) {
			return true;
		}
		return false;
	}

}
