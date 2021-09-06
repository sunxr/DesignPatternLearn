package com.example.observerpattern.demoAnimals;

public class Cat extends MySubject{

    @Override
    public void cry() {
        System.out.println("猫开始叫喊");
        for (MyObserver observer : myObserverArrayList) {
            observer.response();
        }
    }
}
