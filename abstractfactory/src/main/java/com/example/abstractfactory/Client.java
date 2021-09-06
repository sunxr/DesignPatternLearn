package com.example.abstractfactory;

public class Client {

    public static void main(String args[]) {
        OSFactory factory;
        OperationController operationController;
        InterfaceController interfaceController;

        factory = new SymbianFactory();
        operationController = factory.EnableOperationController();
        interfaceController = factory.EnableInterfaceController();
        operationController.showOperationControllerTips();
        interfaceController.showInterfaceControllerTips();
    }

}
