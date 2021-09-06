package com.example.abstractfactory;

public class WinPhoneOperationFactory implements OperationController{
    @Override
    public void showOperationControllerTips() {
        System.out.println("WinPhone OS enable OperationController");
    }
}
