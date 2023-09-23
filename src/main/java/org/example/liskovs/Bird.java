package org.example.liskovs;

/**
 * If we are using inheritance, i.e parent and child relationship, child object should be in a position to replace
 * Parent object without any issues
 */
public class Bird {

    public void fly(){
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird{
    //Since the Peguins can't fly need to override the fly method
    /**
     * If I need to ensure that Liskov's Substitution principle is not violated, I need to override this method
     */

    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }
}

class Sparrow extends Bird {
    //No need to override Bird
}


