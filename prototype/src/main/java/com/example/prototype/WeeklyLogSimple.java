package com.example.prototype;

public class WeeklyLogSimple implements Cloneable{

    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public WeeklyLogSimple clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLogSimple)obj;
        }
        catch (CloneNotSupportedException e) {
            System.out.println("无法复制");
            return null;
        }
    }
}
