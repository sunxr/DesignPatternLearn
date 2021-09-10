package com.example.mediator;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatRoom{

    private Hashtable members = new Hashtable();

    @Override
    public void register(Member member) {
        if (!members.contains(member)) {
            members.put(member.getName(),member);
            member.setChatRoom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) members.get(to);
        String newMessage = message;
        newMessage = message.replaceAll("日","*");
        member.receiveText(from,newMessage);
    }

    @Override
    public void sendImage(String from, String to, String message) {
        Member member = (Member) members.get(to);
        if (message.length() > 5) {
            System.out.println("图片太大，无法发送");
        }
        else {
            member.receiveImage(to,message);
        }
    }
}
