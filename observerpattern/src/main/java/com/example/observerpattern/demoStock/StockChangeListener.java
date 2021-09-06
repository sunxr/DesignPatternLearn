package com.example.observerpattern.demoStock;

public class StockChangeListener extends MySubject{

    private int changeRate;

    public StockChangeListener(int changeRate) {
        this.changeRate = changeRate;
    }

    @Override
    public void notifyStockChange() {
        if(changeRate > 5) {
            for (MyObserver observer : observerArrayList) {
                observer.response(changeRate);
            }
        }
        else {
            System.out.println("波动很小");
        }
    }
}
