package org.moldavets.formatter.Impl;

import org.moldavets.formatter.IFormatter;

public class CsvFormatter implements IFormatter {
    public static String convertObjectToCSV(Object object) {
        return "CSV : ,,, %s ,,,".formatted(object.toString());
    }
}
