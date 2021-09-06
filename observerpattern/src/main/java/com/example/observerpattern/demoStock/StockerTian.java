package com.example.observerpattern.demoStock;

public class StockerTian implements MyObserver{
    @Override
    public void response(int newValue) {
        System.out.println("tian get, the change rate is : " + newValue);
    }
}
