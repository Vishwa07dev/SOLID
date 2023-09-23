package org.example.isp;

public interface Worker {

    void work();
    void manageTeam();
    void writeCode();
}

class Manager implements Worker {

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void manageTeam() {
        System.out.println("Manager is managing the team");

    }

    @Override
    public void writeCode() {
        System.out.println("This is just a dummy method so that things don't break");

    }
}

class Programmer implements  Worker {

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    @Override
    public void manageTeam() {
        System.out.println("Dummy method so that the code don't break");

    }

    @Override
    public void writeCode() {
        System.out.println("Programmer is writing code");

    }
}
