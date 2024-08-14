package adapter;

public class ThirdPartyDeviceAdapter implements SmartDeviceInterface {
    private ThirdPartyDevice thirdPartyDevice;

    public ThirdPartyDeviceAdapter(ThirdPartyDevice thirdPartyDevice) {
        this.thirdPartyDevice = thirdPartyDevice;
    }

    @Override
    public void turnOn() {
        thirdPartyDevice.powerOn();
    }

    @Override
    public void turnOff() {
        thirdPartyDevice.powerOff();
    }

    @Override
    public String getStatus() {
        return thirdPartyDevice.getDeviceStatus();
    }
}