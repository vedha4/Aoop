package main;

import Observer.SmartDevice;
import Observer.UserInterface;

public class ObserverTest {
    public static void main(String[] args) {
        SmartDevice light = new SmartDevice("Living Room Light");
        UserInterface ui = new UserInterface();

        light.registerObserver(ui);
        light.setStatus("on");
        light.setStatus("off");
    }
}