public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("^\\[(INFO|WARNING|ERROR)\\]:(.*)", "$2").trim();
    }

    public static String logLevel(String logLine) {
        return logLine.replaceAll("(?s)\\[(INFO|WARNING|ERROR)\\].*", "$1").toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
