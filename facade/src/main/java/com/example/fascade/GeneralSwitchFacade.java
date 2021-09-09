package com.example.fascade;

public class GeneralSwitchFacade {

    private AirConditioner airConditioner;

    private Fan fan;

    private Television television;

    public GeneralSwitchFacade() {
        airConditioner = new AirConditioner();
        fan = new Fan();
        television = new Television();
    }

    public void on() {
        airConditioner.on();
        fan.on();
        television.on();
    }

    public void off() {
        airConditioner.off();
        fan.off();
        television.off();
    }
}
