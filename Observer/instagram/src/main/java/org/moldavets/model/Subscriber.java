package org.moldavets.model;

import org.moldavets.Observer;

import java.util.List;

public class Subscriber extends BaseUser implements Observer {

    public Subscriber(String username) {
        super(username);
    }

    @Override
    public void accept(List<Post> posts) {
        System.out.println("Dear " + this.getUsername() + " we have some changes in your feed " + posts);
    }

    @Override
    public String toString() {
        return "Subscriber{username=" + this.getUsername() + "}";
    }
}
