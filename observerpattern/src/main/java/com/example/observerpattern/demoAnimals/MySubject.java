package com.example.observerpattern.demoAnimals;

import java.util.ArrayList;

public abstract class MySubject {

    protected ArrayList<MyObserver> myObserverArrayList = new ArrayList<>();

    public void attach(MyObserver observer) {
        myObserverArrayList.add(observer);
    }

    public void remove(MyObserver observer) {
        myObserverArrayList.remove(observer);
    }

    abstract public void cry();

}
