package com.sneshko.collectionsTask2;

import java.util.Collections;
import java.util.List;

public class Actor {
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    Actor(String firstName,String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getFee(){
        return fee;
    }

    public int getAge() { return age; }

    public static String fire(List<Actor> actors){
        Actor actor = actors.get(0);
        //String name = actors.get(0).getFirstName();
        for (Actor i : actors) {
            if (actor.getFee() < i.getFee()) {
                actor = i;
            }
        }

        return actor.getFirstName();
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
