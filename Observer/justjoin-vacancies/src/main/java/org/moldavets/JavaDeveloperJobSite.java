package org.moldavets;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite extends JobSite implements Observed {

    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        super.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        super.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(subscriber -> subscriber.accept(vacancies));
    }
}
