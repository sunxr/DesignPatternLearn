package com.example.singleton;

public class IdentityCardNo {

    private static IdentityCardNo instance = null;

    private String No;

    private IdentityCardNo() {}

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public static IdentityCardNo getInstance() {
        if (instance == null) {
            System.out.println("第一次办理身份证");
            instance = new IdentityCardNo();
            instance.setNo("320621xxxxxx");
        }
        else {
            System.out.println("重复办理身份证，获取旧号码");
        }
        return instance;
    }

}
