package com.example.decoratinopattern;

public class Client {

    public static void main(String args[]) {
        Transform camero;
        camero = new Car();
        camero.move();
        System.out.println("--------------");

        Airplane bumbleBee = new Airplane(camero);
        bumbleBee.move();
        bumbleBee.fly();
    }

}
