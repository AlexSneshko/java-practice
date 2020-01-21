package com.sneshko.collectionsTask2;

import java.util.List;

public class Actor {
    private String firstName;
    private String lastName;
    private int fee;

    Actor(String firstName,String lastName, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getFee(){
        return fee;
    }

    public static String fire(List<Actor> actors){

        String name = actors.get(0).getFirstName();
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                '}';
    }

}
