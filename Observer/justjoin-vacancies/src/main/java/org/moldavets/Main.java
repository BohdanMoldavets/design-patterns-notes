package org.moldavets;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();
        PythonDeveloperJobSite pythonDeveloperJobSite = new PythonDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("Middle Java developer");
        javaDeveloperJobSite.addVacancy("Senior Full-Stack developer (Java + Angular)");

        javaDeveloperJobSite.addObserver(new Subscriber("Jack"));
        javaDeveloperJobSite.addObserver(new Subscriber("Tom"));

        javaDeveloperJobSite.addVacancy("Junior Backend Engineer with Java");

        pythonDeveloperJobSite.addVacancy("Junior Backend Engineer with Python");
        pythonDeveloperJobSite.addVacancy("Middle Developer (Python)");
        pythonDeveloperJobSite.addObserver(new Subscriber("John"));
        pythonDeveloperJobSite.addVacancy("Middle Developer (Python)");




    }
}