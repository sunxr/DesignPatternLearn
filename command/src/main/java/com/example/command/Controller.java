package com.example.command;

public class Controller {

    private AbstractCommand changeCommand, closeCommand, openCommand;

    public Controller(AbstractCommand changeCommand,AbstractCommand closeCommand, AbstractCommand openCommand) {
        this.changeCommand = changeCommand;
        this.closeCommand = closeCommand;
        this.openCommand = openCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }

}
