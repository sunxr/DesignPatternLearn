package com.example.bridge;

public class Red implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType + "红色的" + name);
    }
}
