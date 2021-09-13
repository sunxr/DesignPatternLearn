package com.example.bridge;

public class Client {

    public static void main(String args[]) {
        Color color;
        Pen pen;

        color = new Red();
        pen = new BigPen();
        pen.setColor(color);
        pen.draw("鲜花");

        color = new Black();
        pen = new SmallPen();
        pen.setColor(color);
        pen.draw("云朵");
    }

}


