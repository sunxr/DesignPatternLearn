package com.example.observerpattern.demoStock;

public class StockerSun implements MyObserver{
    @Override
    public void response(int newValue) {
        System.out.println("sun get, the change rate is : " + newValue);
    }
}
