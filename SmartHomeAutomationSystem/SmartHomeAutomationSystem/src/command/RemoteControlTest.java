package command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Observer.SmartDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoteControlTest {

    private SmartDevice light;
    private RemoteControl remote;

    @BeforeEach
    void setUp() {
        light = new SmartDevice("Living Room Light");
        remote = new RemoteControl();
    }

    @Test
    void testTurnOnCommand() {
        remote.setCommand(new TurnOnCommand(light));
        remote.pressButton();
        assertEquals("on", light.getStatus());
    }

    @Test
    void testTurnOffCommand() {
        remote.setCommand(new TurnOffCommand(light));
        remote.pressButton();
        assertEquals("off", light.getStatus());
    }
}
