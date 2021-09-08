package com.example.adapter;

public class Client {

    public static void main(String args[]) {
        DataOperation dataOperation = new NewCipherAdapter();
        dataOperation.setPassword("RxSun");
        String ps = dataOperation.getPassword();
        String es = dataOperation.doEncrypt(4 , ps);
        System.out.println("明文：" + ps);
        System.out.println("密文：" + es);
    }

}
