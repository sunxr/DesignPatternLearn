package com.example.builder;

public abstract class PageBuilder {

    protected Page page = new Page();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildMainWindow();

    public abstract void buildControlStrip();

    public Page createPage() {
        return page;
    }

    public boolean isShowMenu() {
        return true;
    }

    public boolean isShowPlayList() {
        return true;
    }

    public boolean isShowMainWindow() {
        return true;
    }

    public boolean isShowControlStrip() {
        return true;
    }

}
