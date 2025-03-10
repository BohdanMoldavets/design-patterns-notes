package org.moldavets.formatter.Impl;

import org.moldavets.formatter.IFormatter;

public class XmlFormatter implements IFormatter {
    public static String convertObjectToXML(Object object) {
        return "XML : <title> %s </title>".formatted(object.toString());
    }
}
