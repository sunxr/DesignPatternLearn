package com.example.builder;

public class Client {

    public static void main(String args[]) {
        PageController pc = new PageController();
        Page page;

        PageBuilder pb;
        pb = new CompleteBuilder();
        page = pc.construct(pb);
        System.out.println("Complete Menu: " + page.getMenu());
        System.out.println("Complete Play List: " + page.getPlayList());
        System.out.println("Complete Main Window: " + page.getMainWindow());
        System.out.println("Complete Control Strip: " + page.getControlStrip());
        System.out.println("----------------------");

        pb = new SimpleBuilder();
        page = pc.construct(pb);
        System.out.println("Simple Menu: " + page.getMenu());
        System.out.println("Simple Play List: " + page.getPlayList());
        System.out.println("Simple Main Window: " + page.getMainWindow());
        System.out.println("Simple Control Strip: " + page.getControlStrip());
        System.out.println("----------------------");

        pb = new MemoryBuilder();
        page = pc.construct(pb);
        System.out.println("Memory Menu: " + page.getMenu());
        System.out.println("Memory Play List: " + page.getPlayList());
        System.out.println("Memory Main Window: " + page.getMainWindow());
        System.out.println("Memory Control Strip: " + page.getControlStrip());
        System.out.println("----------------------");
    }

}
