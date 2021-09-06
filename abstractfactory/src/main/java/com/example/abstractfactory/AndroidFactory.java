package com.example.abstractfactory;

public class AndroidFactory implements OSFactory{
    @Override
    public OperationController EnableOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController EnableInterfaceController() {
        return new AndroidInterfaceController();
    }
}
