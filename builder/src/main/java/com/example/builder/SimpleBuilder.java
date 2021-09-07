package com.example.builder;

public class SimpleBuilder extends PageBuilder{
    @Override
    public void buildMenu() {
        page.setMenu("简单模式：显示菜单");
    }

    @Override
    public void buildPlayList() {
        page.setPlayList("简单模式：显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        page.setMainWindow("简单模式：显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        page.setControlStrip("简单模式：显示控制条");
    }

    @Override
    public boolean isShowMenu() {
        return false;
    }

    @Override
    public boolean isShowPlayList() {
        return false;
    }
}
