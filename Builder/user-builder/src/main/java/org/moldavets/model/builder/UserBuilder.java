package org.moldavets.model.builder;

import org.moldavets.model.User;

public class UserBuilder {

    private User user = new User();

    public UserBuilder firstName(String value) {
        this.user.setFistName(value);
        return this;
    }

    public UserBuilder lastName(String value) {
        this.user.setLastName(value);
        return this;
    }

    public UserBuilder email(String value) {
        this.user.setEmail(value);
        return this;
    }

    public UserBuilder age(Integer value) {
        this.user.setAge(value);
        return this;
    }

    public User build() {
        return user;
    }
}
