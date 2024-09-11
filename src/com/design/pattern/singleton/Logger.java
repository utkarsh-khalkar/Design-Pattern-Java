package com.design.pattern.singleton;

public class Logger {

    // Single instance of logger
    private static Logger logger=null;


    // Private constructor to prevent instantiation
    private Logger()
    {}


    // public method to provide access to the single instance
    public static Logger getInstance() {

        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger=new Logger();
                }
            }
        }
        return logger;
    }

    // Method to Log messages..
    public  void  log(String message)
    {
        System.out.println("Log Entry:"+message);
    }
}
class Application
{
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();
        logger.log("Application Started..");
        logger.log("Error Occurred");
    }
}