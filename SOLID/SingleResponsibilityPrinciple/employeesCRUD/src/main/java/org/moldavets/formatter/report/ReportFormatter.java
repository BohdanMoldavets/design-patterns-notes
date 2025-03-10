package org.moldavets.formatter.report;

import org.moldavets.formatter.Impl.CsvFormatter;
import org.moldavets.formatter.Impl.XmlFormatter;
import org.moldavets.util.FormatType;

public class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case CSV -> formattedOutput = CsvFormatter.convertObjectToCSV(object);
            case XML -> formattedOutput = XmlFormatter.convertObjectToXML(object);
        }
    }

    protected String getFormattedValue() {
        return formattedOutput;
    }

}
