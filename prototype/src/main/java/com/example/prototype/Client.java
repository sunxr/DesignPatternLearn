package com.example.prototype;

public class Client {

    public static void main(String args[]) {

        WeeklyLogSimple simpleLogPrevious, simpleLogNew;
        simpleLogPrevious = new WeeklyLogSimple();
        Attachment attachment = new Attachment();
        simpleLogPrevious.setAttachment(attachment);
        simpleLogNew = simpleLogPrevious.clone();
        System.out.println("浅复制");
        System.out.println("周报是否相同：" + (simpleLogPrevious == simpleLogNew));
        System.out.println("附件是否相同：" + (simpleLogPrevious.getAttachment() == simpleLogNew.getAttachment()));
        System.out.println("-------------");


    }

}
