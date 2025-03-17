package org.moldavets.logger.Impl;

import org.moldavets.logger.CustomLogger;

import java.time.LocalDateTime;

public class CustomLoggerImpl implements CustomLogger {
    private static CustomLoggerImpl INSTANCE;

    private CustomLoggerImpl() {}

    public static CustomLoggerImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomLoggerImpl();
        }
        return INSTANCE;
    }

    @Override
    public void INFO(String message) {
        System.out.println(logFormatter("INFO") + message);
    }

    @Override
    public void ERROR(String message) {
        System.out.println(logFormatter("ERROR") + message);
    }

    @Override
    public void WARN(String message) {
        System.out.println(logFormatter("WARN") + message);
    }

    private String logFormatter(String logType) {
        return String.format("%s [%s] ", LocalDateTime.now(), logType.trim());
    }
}
