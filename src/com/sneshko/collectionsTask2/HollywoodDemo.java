package com.sneshko.collectionsTask2;

import java.util.ArrayList;
import java.util.List;

import static com.sneshko.collectionsTask2.Actor.fire;

public class HollywoodDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<Actor>();
        Actor sasha = new Actor("Sasha", "Petrov", 150_000);
        Actor alex = new Actor("Alex", "Polad", 100_000);
        Actor bob = new Actor("Bob", "Tob", 10_000);

        actors.add(sasha);
        actors.add(alex);
        actors.add(bob);

        System.out.println(actors);
        String bestActor = fire(actors);
        System.out.println(bestActor);
    }
}
