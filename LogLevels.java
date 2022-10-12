public class LogLevels {
    public static String message(String logLine) {
        if (logLine.contains("[ERROR]:")) {
            return logLine.replace("[ERROR]:", "").trim();
        } else if (logLine.contains("[WARNING]:")) {
            return logLine.replace("[WARNING]:", "").trim();
        } else if (logLine.contains("[INFO]:")) {
            return logLine.replace("[INFO]:", "").trim();
        } else {
            return "";
        }
    }
    public static String logLevel(String logLine) {
        if (logLine.contains("[ERROR]:")) {
            return "error";
        } else if (logLine.contains("[WARNING]:")) {
            return "warning";
        } else if (logLine.contains("[INFO]:")) {
            return "info";
        } else {
            return "";
        }
    }
    public static String reformat(String logLine) {
        if (logLine.contains("[ERROR]:")) {
            return logLine.substring(logLine.indexOf(" ")).trim() + " (error)";
        } else if (logLine.contains("[WARNING]:")) {
            return logLine.substring(logLine.indexOf(" ")).trim() + " (warning)";
        } else if (logLine.contains("[INFO]:")) {

            return logLine.substring(logLine.indexOf(" ")).trim() + " (info)";
        } else {
            return "";
        }
    }
}