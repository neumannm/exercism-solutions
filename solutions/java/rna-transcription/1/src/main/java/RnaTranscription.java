class RnaTranscription {

	String transcribe(String dnaStrand) {
    	if(dnaStrand.isEmpty()) {
    		return new String();
    	}
    	StringBuilder builder = new StringBuilder();
    	for (int i = 0; i < dnaStrand.length(); i++) {
    		switch (dnaStrand.charAt(i)) {
    		case 'A':
    			builder.append('U');
    			break;
    		case 'C':
    			builder.append('G');
    			break;
    		case 'T':
    			builder.append('A');
    			break;
    		case 'G':
    			builder.append('C');
    			break;
    		}
		}
        return builder.toString();
    }


}
