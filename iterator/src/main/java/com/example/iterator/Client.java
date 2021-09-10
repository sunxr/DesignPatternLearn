package com.example.iterator;

public class Client {

    private static void display(Television tv) {
        TVIterator tvIterator = tv.createIterator();
        System.out.println("电视机频道：");
        while (!tvIterator.isLast()) {
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.next();
        }
    }

    private static void reverseDisplay(Television tv) {
        TVIterator tvIterator = tv.createIterator();
        tvIterator.setChannel(5);
        System.out.println("逆序遍历电视机：");
        while (!tvIterator.isFirst()) {
            tvIterator.previous();
            System.out.println(tvIterator.currentChannel().toString());
        }
    }

    public static void main(String args[]) {
        Television tv;
        tv = new TCLTelevision();
        display(tv);
        System.out.println("---------");
        reverseDisplay(tv);
    }

}
