package org.moldavets;

import org.moldavets.model.Author;
import org.moldavets.model.InstagramAccount;
import org.moldavets.model.Post;
import org.moldavets.model.Subscriber;

public class Main {
    public static void main(String[] args) {
        Author IShowSpeed = new Author("I Show Speed");
        Author Jimmy = new Author("Jimmy");
        Subscriber John = new Subscriber("John");
        Post fortnitePost = new Post("I'm plaing Fortnite for 3 hours", IShowSpeed, "Just playing fortnite!!");
        Post lamboPost = new Post("I bought lamborghini", IShowSpeed, "I lose 20$ mil.");

        InstagramAccount speedAccount = new InstagramAccount("SpeedOfficial");
        speedAccount.addPost(fortnitePost);
        speedAccount.addObserver(John);
        speedAccount.addPost(lamboPost);

        InstagramAccount mrBeast = new InstagramAccount("MrBeast");
        mrBeast.addObserver(John);
        mrBeast.addPost(new Post("I send 100K$ to poland", Jimmy, "I want to learn polish language"));


    }
}