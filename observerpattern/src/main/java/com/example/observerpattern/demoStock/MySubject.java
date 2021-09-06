package com.example.observerpattern.demoStock;

import java.util.ArrayList;

public abstract class MySubject {

    protected ArrayList<MyObserver> observerArrayList = new ArrayList<>();

    public void attach(MyObserver observer) {
        observerArrayList.add(observer);
    }

    public void remove(MyObserver observer) {
        observerArrayList.remove(observer);
    }

    abstract public void notifyStockChange();

}
