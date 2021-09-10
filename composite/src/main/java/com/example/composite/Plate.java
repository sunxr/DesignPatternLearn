package com.example.composite;

import java.util.ArrayList;

public class Plate implements MyElement{

    private ArrayList<MyElement> myElements = new ArrayList<>();

    public void add(MyElement element) {
        myElements.add(element);
    }

    public void delete(MyElement element) {
        myElements.remove(element);
    }

    @Override
    public void eat() {
        for (MyElement element : myElements) {
            element.eat();
        }
    }
}
