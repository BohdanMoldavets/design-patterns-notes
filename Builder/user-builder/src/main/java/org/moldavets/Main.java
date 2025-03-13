package org.moldavets;

import org.moldavets.model.Car;
import org.moldavets.model.Post;
import org.moldavets.model.builder.UserBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println(new UserBuilder()
                .firstName("John")
                .lastName("Doe")
                .email("john@doe.com")
                .build()
        );

        System.out.println(new Post.Builder()
//                .title("Siema")
                .content("Stary")
                .category("Old Hello")
                .build()
        );

        System.out.println(new Car.Builder()
                .brand("BMW")
                .year(2016)
                .color("Yellow")
                .build());
    }
}