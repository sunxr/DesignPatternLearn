package com.example.abstractfactory;

public class AndroidOperationController implements OperationController{
    @Override
    public void showOperationControllerTips() {
        System.out.println("Android OS enable OperationController");
    }
}
