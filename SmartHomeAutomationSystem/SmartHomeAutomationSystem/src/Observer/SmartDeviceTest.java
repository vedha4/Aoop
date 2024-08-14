package Observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmartDeviceTest {

    private SmartDevice light;
    private UserInterface ui;

    @BeforeEach
    void setUp() {
        light = new SmartDevice("Living Room Light");
        ui = new UserInterface();
        light.registerObserver(ui);
    }

    @Test
    void testInitialStatus() {
        assertEquals("off", light.getStatus());
    }

    @Test
    void testObserverUpdateOnStatusChange() {
        light.setStatus("on");
        assertEquals("on", light.getStatus());

        light.setStatus("off");
        assertEquals("off", light.getStatus());
    }
}