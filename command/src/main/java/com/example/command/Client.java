package com.example.command;

public class Client {

    public static void main(String args[]) {
        AbstractCommand openCommand, closeCommand, changeCommand;

        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller controller = new Controller(changeCommand,closeCommand,openCommand);

        controller.open();
        controller.change();
        controller.close();
    }

}
