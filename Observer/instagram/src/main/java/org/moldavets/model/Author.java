package org.moldavets.model;

public class Author extends BaseUser {
    public Author(String username) {
        super(username);
    }

    @Override
    public String toString() {
        return "Author{username=" + getUsername() + "}";
    }


}
