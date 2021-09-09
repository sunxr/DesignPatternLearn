package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy() {}

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        preRequest();
        method.invoke(object, objects);
        postRequest();
        return null;
    }

    private void preRequest() {
        System.out.println("调用之前");
    }

    private void postRequest() {
        System.out.println("调用之后");
    }
}
