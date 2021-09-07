package com.example.builder;

public class NetworkBuilder extends PageBuilder{
    @Override
    public void buildMenu() {
        page.setMenu("网络模式：显示菜单");
    }

    @Override
    public void buildPlayList() {
        page.setPlayList("网络模式：显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        page.setMainWindow("网络模式：显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        page.setControlStrip("网络模式：显示控制条");
    }
}
