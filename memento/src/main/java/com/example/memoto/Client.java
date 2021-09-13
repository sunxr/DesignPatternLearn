package com.example.memoto;

public class Client {

    public static void main(String args[]) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();

        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("1230000000");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("------------");

        user.setPassword("789456");
        user.setTelNo("134523400000");
        System.out.println("状态二：");
        user.show();
        System.out.println("------------");

        user.restoreMemento(c.getMemento());//从备忘录中恢复数据
        System.out.println("回到状态一：");
        user.show();
        System.out.println("------------");
    }

}
