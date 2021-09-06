package com.example.observerpattern.demoStock;

public class Client {

    public static void main(String args[]) {
        MySubject subject1 = new StockChangeListener(1);

        MyObserver observerSun = new StockerSun();
        MyObserver observerTian = new StockerTian();

        subject1.attach(observerSun);
        subject1.attach(observerTian);

        subject1.notifyStockChange();


        MySubject subject2 = new StockChangeListener(6);

        MyObserver observerSun2 = new StockerSun();
        MyObserver observerTian2 = new StockerTian();

        subject2.attach(observerSun2);
        subject2.attach(observerTian2);

        subject2.notifyStockChange();
    }

}
