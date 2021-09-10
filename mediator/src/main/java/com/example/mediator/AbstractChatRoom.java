package com.example.mediator;

public abstract class AbstractChatRoom {

    public abstract void register(Member member);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String message);

}
