package creationpattern.singleton;

/**
 * Single Instance: Only one object of the class is created throughout the application's lifecycle.
 * Global Access: Provides a way to access the instance from anywhere in the code.
 * Lazy Initialization: The instance is created only when it is needed (optional).
 * Thread Safety: Ensures that the instance is created in a thread-safe manner.
 *
 *
 *
 *  -----Use Cases-------
 * ✅ Database connections – Ensure only one connection object.
 * ✅ Configuration settings – Centralize configuration values.
 * ✅ Logging – Use a single logger instance.
 * ✅ Caching – Maintain a single cache object.
 *
 * ------Disadvantages----------
 * ❌ Can make unit testing harder due to hidden dependencies.
 * ❌ Increased memory usage if the instance is created but not used.
 * ❌ Breaks Single Responsibility Principle if combined with other logic.
 */


//eager initialization - when jvm load it will create
public class Singleton {
    private static final Singleton singleton = new Singleton();
    public Singleton(){}

    public void message(){
        System.out.println("hello i am eager initialization");
    }

    public static Singleton getSingleton(){
        return singleton;
    }


    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.message();
    }
}

