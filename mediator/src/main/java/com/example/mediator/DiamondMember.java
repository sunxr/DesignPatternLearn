package com.example.mediator;

public class DiamondMember extends Member{
    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发送消息：");
        chatRoom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石会员发送图片：");
        chatRoom.sendImage(name, to, image);
    }
}
