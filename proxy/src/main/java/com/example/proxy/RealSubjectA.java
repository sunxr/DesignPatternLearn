package com.example.proxy;

public class RealSubjectA implements AbstractSubject{
    @Override
    public void request() {
        System.out.println("真实主题类A");
    }
}
