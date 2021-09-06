package com.example.factorymethod;

public class GIFImageFactory implements ImageFactory{
    @Override
    public Image createImageType() {
        Image image = new GIFImage();
        return image;
    }
}
