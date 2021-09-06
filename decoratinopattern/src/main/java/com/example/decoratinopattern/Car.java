package com.example.decoratinopattern;

public class Car implements Transform{

    public Car() {
        System.out.println("变形金刚原本是一辆车");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动");
    }
}
