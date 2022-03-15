package creational.singleton;

public class Logger {
    // Private constructor so object cannot be instantiated directly
    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        // Instantiate only if logger is null.
        // Ensures there is always a single object.
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }
}
