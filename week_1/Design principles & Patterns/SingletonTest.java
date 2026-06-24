class Logger {
 
  // Private static instance
  private static volatile Logger instance; 
  
  // Private constructor
  private Logger() 
  {
    System.out.println("Logger Instance Created!");
  }

  // Public method to get the single instance
  public static Logger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null)
          instance = new Logger();
      }
    }
    return instance;
  }

  // Logging method
  public void log(String message) {
    System.out.println("[LOG] " + message);
  }
}

// Test class
public class SingletonTest {
  public static void main(String[] args) {
    Logger l1 = Logger.getInstance();
    Logger l2 = Logger.getInstance();
    l1.log("App started");
    System.out.println(l1 == l2); // true — same instance
  }
}
