package main;

import command.RemoteControl;
import command.TurnOnCommand;
import command.TurnOffCommand;
import Observer.SmartDevice;

public class CommandTest {
    public static void main(String[] args) {
        SmartDevice light = new SmartDevice("Living Room Light");
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnOnCommand(light));
        remote.pressButton();

        remote.setCommand(new TurnOffCommand(light));
        remote.pressButton();
    }
}