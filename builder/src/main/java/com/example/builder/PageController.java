package com.example.builder;

public class PageController {

    public Page construct(PageBuilder pb) {
        Page page;
        if (pb.isShowMenu()) {
            pb.buildMenu();
        }

        if (pb.isShowPlayList()) {
            pb.buildPlayList();
        }

        if (pb.isShowMainWindow()) {
            pb.buildMainWindow();
        }

        if (pb.isShowControlStrip()) {
            pb.buildControlStrip();
        }

        page = pb.createPage();
        return page;
    }

}
