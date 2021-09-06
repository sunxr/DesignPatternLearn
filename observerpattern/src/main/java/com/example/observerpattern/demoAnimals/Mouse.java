package com.example.observerpattern.demoAnimals;

public class Mouse implements MyObserver{
    @Override
    public void response() {
        System.out.println("老鼠赶紧跑");
    }
}
