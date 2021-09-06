package com.example.factorymethod;

public class Client {

    public static void main(String args[]) {
        ImageFactory imageFactory;
        Image image;

        imageFactory = new JPGImageFactory();
        image = imageFactory.createImageType();
        image.showImage();
    }

}
