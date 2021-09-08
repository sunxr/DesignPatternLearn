package com.example.adapter;

public class NewCipherAdapter extends DataOperation{

    public NewCipher newCipher;

    public NewCipherAdapter() {
        newCipher = new NewCipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return newCipher.doEncrypt(key,ps);
    }
}
