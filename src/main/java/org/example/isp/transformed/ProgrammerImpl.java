package org.example.isp.transformed;

public class ProgrammerImpl implements Programmer{
    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    @Override
    public void writeCode() {
        System.out.println("Programmer is writing code");
    }
}
