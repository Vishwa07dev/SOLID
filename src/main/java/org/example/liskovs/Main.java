package org.example.liskovs;

/**
 * 1. Behaviour Inconsistency
 * 2. Maintenance Challenges
 * 3. Complexity
 * 4. Loss of Type Safety
 */
public class Main {
    public static void makeBirdFly(Bird bird){
        bird.fly();
    }
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();
        makeBirdFly(penguin); // This will fly penguin which is not correct ! So it violates LSP
        makeBirdFly(sparrow);
    }
}
