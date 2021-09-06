package com.example.abstractfactory;

public class WinPhoneFactory implements OSFactory{
    @Override
    public OperationController EnableOperationController() {
        return new WinPhoneOperationFactory();
    }

    @Override
    public InterfaceController EnableInterfaceController() {
        return new WinPhoneInterfaceController();
    }
}
