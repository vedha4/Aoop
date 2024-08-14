package main;

import adapter.SmartDeviceInterface;
import adapter.ThirdPartyDevice;
import adapter.ThirdPartyDeviceAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        ThirdPartyDevice thirdPartyDevice = new ThirdPartyDevice();
        SmartDeviceInterface adapter = new ThirdPartyDeviceAdapter(thirdPartyDevice);

        adapter.turnOn();
        adapter.turnOff();
        System.out.println(adapter.getStatus());
    }
}