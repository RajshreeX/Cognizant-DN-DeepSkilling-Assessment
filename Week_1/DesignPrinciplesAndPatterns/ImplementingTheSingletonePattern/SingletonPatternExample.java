package ImplementingTheSingletonePattern;
public class SingletonPatternExample {
    static class Logger{
        private static Logger instance;
        private Logger() {
            System.out.println("Logger instance created.");
        }

        public static Logger getInstance() {
            if(instance==null) {
                instance=new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("Log: "+message);
        }
    }

    public static void main(String args[]) {
        Logger logger1 = Logger.getInstance();
        logger1.log("log for logger1");

        Logger logger2=Logger.getInstance();
        logger2.log("log from logger2");

        if(logger1==logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance. Singleton Passed");
        }
        else {
            System.out.println("Different instances were created. No Singleton Pattern exists.");
        }
    }
}
