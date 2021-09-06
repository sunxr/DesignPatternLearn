package com.example.abstractfactory;

public class SymbianOperationController implements OperationController{
    @Override
    public void showOperationControllerTips() {
        System.out.println("Symbian OS enable OperationController");
    }
}
