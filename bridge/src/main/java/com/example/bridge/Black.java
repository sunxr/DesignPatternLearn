package com.example.bridge;

public class Black implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType + "黑色的" + name);
    }
}
