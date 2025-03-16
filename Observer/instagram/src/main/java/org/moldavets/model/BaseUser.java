package org.moldavets.model;

public abstract class BaseUser {
    private String username;

    public BaseUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract String toString();
}
