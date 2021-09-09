package com.example.singleton;

public class Client {

    public static void main (String args[]) {
        IdentityCardNo no1, no2;
        no1 = IdentityCardNo.getInstance();
        no2 = IdentityCardNo.getInstance();
        System.out.println("身份证号码是否一致：" + (no1 == no2));

        String s1,s2;
        s1 = no1.getNo();
        s2 = no2.getNo();
        System.out.println("第一次号码：" + s1);
        System.out.println("第二次号码：" + s2);
        System.out.println("两次是否相等：" + s1.equals(s2));
        System.out.println("是否相同对象：" + (s1 == s2));
    }

}
