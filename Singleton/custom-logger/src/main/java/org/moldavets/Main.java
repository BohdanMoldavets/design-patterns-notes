package org.moldavets;

import org.moldavets.logger.CustomLogger;
import org.moldavets.logger.Impl.CustomLoggerImpl;

public class Main {
    public static void main(String[] args) {
        CustomLoggerImpl customLogger = CustomLoggerImpl.getInstance();
        customLogger.INFO("Hello World");
        customLogger.INFO("Hello World");
        customLogger.INFO("Hello World");
        customLogger.ERROR("Hello World");
        customLogger.INFO("Hello World");
        customLogger.INFO("Hello World");
    }
}