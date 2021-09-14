package com.example.visitor;

public class Client {

    public static void main(String args[]) {
        Product p1 = new Book();
        Product p2 = new Book();
        Product p3 = new Apple();

        Visitor visitor1, visitor2;
        BuyBasket buyBasket = new BuyBasket();

        buyBasket.addProduct(p1);
        buyBasket.addProduct(p2);
        buyBasket.addProduct(p3);

        visitor1 = new Customer();
        visitor1.setName("张三");
        buyBasket.accept(visitor1);

        visitor2 = new Saler();
        visitor2.setName("李四");
        buyBasket.accept(visitor2);
    }

}
