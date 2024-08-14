package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdPartyDeviceAdapterTest {

    private ThirdPartyDevice thirdPartyDevice;
    private SmartDeviceInterface adapter;

    @BeforeEach
    void setUp() {
        thirdPartyDevice = new ThirdPartyDevice();
        adapter = new ThirdPartyDeviceAdapter(thirdPartyDevice);
    }

    @Test
    void testAdapterTurnOn() {
        adapter.turnOn();
        // Add assertions if necessary for your actual implementation
    }

    @Test
    void testAdapterTurnOff() {
        adapter.turnOff();
        // Add assertions if necessary for your actual implementation
    }

    @Test
    void testAdapterGetStatus() {
        String status = adapter.getStatus();
        assertEquals("Third-party device status", status);
    }
}
