package com.example.observerpattern.demoAnimals;

public class Client {

    public static void main(String args[]) {
        MySubject subject = new Cat();

        MyObserver observer1, observer2, observer3;

        observer1 = new Dog();
        observer2 = new Pig();
        observer3 = new Mouse();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.cry();
    }

}
