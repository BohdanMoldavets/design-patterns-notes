package org.moldavets.model;

import org.moldavets.Observed;
import org.moldavets.Observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramAccount implements Observed {

    private String accountName;

    private List<Post> posts = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public InstagramAccount(String accountName) {
        this.accountName = accountName;
    }

    public void addPost(Post post) {
        this.posts.add(post);
        notifyObservers();
    }

    public void removePost(Post post) {
        this.posts.remove(post);
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
        this.subscribers.forEach(subscriber -> subscriber.accept(posts));
    }
}
