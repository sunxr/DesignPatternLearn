package com.example.templatemethod;

public class HookClient {

    public static void main(String args[]) {
        HookDemo hd;

        hd = new SubHookDemo();
        hd.process();
    }

}
