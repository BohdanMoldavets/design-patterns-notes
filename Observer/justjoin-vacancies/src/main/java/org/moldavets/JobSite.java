package org.moldavets;

import java.util.ArrayList;
import java.util.List;

public abstract class JobSite {
    protected List<String> vacancies = new ArrayList<>();

    public abstract void addVacancy(String vacancy);
    public abstract void removeVacancy(String vacancy);
}
