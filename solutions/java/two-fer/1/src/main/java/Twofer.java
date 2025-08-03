class Twofer {
    String twofer(String name) {
	if(null == name)
		return "One for you, one for me.";
	else 
		return new StringBuilder().append("One for ").append(name).append(", one for me.").toString();
    }
}