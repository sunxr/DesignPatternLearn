package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String args[]) {
        InvocationHandler invocationHandler = null;
        AbstractSubject abstractSubject = null;

        invocationHandler = new DynamicProxy(new RealSubjectA());
        abstractSubject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, invocationHandler);
        abstractSubject.request();

        System.out.println("---------------");

        invocationHandler = new DynamicProxy(new RealSubjectB());
        abstractSubject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, invocationHandler);
        abstractSubject.request();

    }

}
