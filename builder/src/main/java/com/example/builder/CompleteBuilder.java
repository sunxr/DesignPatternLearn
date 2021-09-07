package com.example.builder;

public class CompleteBuilder extends PageBuilder{
    @Override
    public void buildMenu() {
        page.setMenu("完整模式：显示菜单");
    }

    @Override
    public void buildPlayList() {
        page.setPlayList("完整模式：显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        page.setMainWindow("完整模式：显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        page.setControlStrip("完整模式：显示控制条");
    }
}
