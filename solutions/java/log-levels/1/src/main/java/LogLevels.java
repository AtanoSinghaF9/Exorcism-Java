public class LogLevels {

    // Extracts the message part of the log line
    public static String message(String logLine) {
        // Split at ": " to separate level and message
        String[] parts = logLine.split(": ", 2);
        // Trim whitespace and return the message
        return parts[1].trim();
    }

    // Extracts the log level in lowercase
    public static String logLevel(String logLine) {
        // Find the text between [ and ]
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        String level = logLine.substring(start, end);
        return level.toLowerCase();
    }

    // Reformats into "message (level)"
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
