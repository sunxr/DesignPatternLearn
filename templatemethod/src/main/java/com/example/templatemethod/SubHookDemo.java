package com.example.templatemethod;

public class SubHookDemo extends HookDemo{
    @Override
    public void getData() {
        System.out.println("从XML中读取文件");
    }

    @Override
    public void displayData() {
        System.out.println("以柱状图显示");
    }

    public boolean isValid() {
        return false;
    }
}
