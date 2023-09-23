package org.example.ocp;

public class Shape {

    public void draw(int type){
        if(type ==1 ){
            System.out.println("Drawing a circle");
        }else if ( type ==2){
            System.out.println("Drawing a rectangle");
        }
    }

}
