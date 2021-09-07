package com.example.builder;

public class MemoryBuilder extends PageBuilder{
    @Override
    public void buildMenu() {
        page.setMenu("记忆模式：显示菜单");
    }

    @Override
    public void buildPlayList() {
        page.setPlayList("记忆模式：显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        page.setMainWindow("记忆模式：显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        page.setControlStrip("记忆模式：显示控制条");
    }

    @Override
    public boolean isShowMenu() {
        return false;
    }
}
