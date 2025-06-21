package com.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        loggerA.logMessage("Starting the application");
        loggerB.logMessage("Processing request");

        if (loggerA == loggerB) {
            System.out.println("Both references point to the same Logger instance.");
        } else {
            System.out.println("Different instances found. Singleton failed.");
        }
    }
}