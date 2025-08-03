import java.util.Scanner;

class Acronym {

	private String phrase;

	Acronym(String phrase) {
		this.phrase = phrase;
	}

    String get() {
        phrase = phrase
        		.replaceAll("[-_,]", " ")
        		.toUpperCase();
        
		StringBuilder acroBuilder = new StringBuilder();
		Scanner scanner = new Scanner(phrase);
		while (scanner.hasNext()) {
			acroBuilder.append(scanner.next().charAt(0));
		}
		scanner.close();
		return acroBuilder.toString();
    }

}
