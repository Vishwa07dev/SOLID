package org.example.isp.transformed;

public class ManagerIml implements Manager{
    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void manageTeam() {
        System.out.println("Manager is managing team");
    }
}
