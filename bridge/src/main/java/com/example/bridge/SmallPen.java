package com.example.bridge;

public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.bePaint(penType,name);
    }
}
