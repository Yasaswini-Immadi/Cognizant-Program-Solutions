public class Logger {

    // Private static variable that holds the single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); 
        }
        return instance;
    }

    
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}