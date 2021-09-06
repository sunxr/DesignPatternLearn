package com.example.factorymethod;

public class JPGImageFactory implements ImageFactory{
    @Override
    public Image createImageType() {
        Image image = new JPGImage();
        return image;
    }
}
