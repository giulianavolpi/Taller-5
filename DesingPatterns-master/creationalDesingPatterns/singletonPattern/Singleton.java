package creationalDesingPatterns.singletonPattern;

// Eagerly initialization

final class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

// Lazy initialization and thread safe

final class SingletonTS {

    private static volatile SingletonTS instance = null;

    private SingletonTS(){}

    // Lazy initialization and thread safe
    public static SingletonTS getInstance(){
        if (instance == null) { 
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new SingletonTS();
                }
            }
        }
        return instance;
    }
}


// initialization-on-demand holder idiom (Lazy initialization and thread safe)

final class SingletonIoD {

    private SingletonIoD(){}

    private static class lazyHolder { 
        static final SingletonIoD INSTANCE = new SingletonIoD();
    }

    public static SingletonIoD getInstance() {
        return lazyHolder.INSTANCE;
    }
}

/*
When the class SingletonIoD is loaded by the JVM, the class goes through initialization. 
Since the class does not have any static variables to initialize, the initialization completes trivially.
The static class definition LazyHolder within it is not initialized until the JVM determines that LazyHolder must be executed.
The static class LazyHolder is only executed when the static method getInstance is invoked on the class SingletonIoD, 
and the first time this happens the JVM will load and initialize the LazyHolder class.
The initialization of the LazyHolder class results in static variable INSTANCE being initialized by executing
the (private) constructor for the outer class SingletonIoD. Since the class initialization phase is guaranteed by the JLS
(Java Language Specification) to be sequential, i.e., non-concurrent, no further synchronization is required in the static
getInstance method duringloading and initialization. And since the initialization phase writes the static variable INSTANCE
in a sequential operation, all subsequent concurrent invocations of the getInstance will return the same correctly initialized
INSTANCE without incurring any additional synchronization overhead.
*/