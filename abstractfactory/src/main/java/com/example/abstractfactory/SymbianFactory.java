package com.example.abstractfactory;

public class SymbianFactory implements OSFactory{
    @Override
    public OperationController EnableOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController EnableInterfaceController() {
        return new SymbianInterfaceController();
    }
}
