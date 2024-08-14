package adapter;

public class ThirdPartyDevice {
	public void powerOn() {
        System.out.println("Third-party device powered on");
    }

    public void powerOff() {
        System.out.println("Third-party device powered off");
    }

    public String getDeviceStatus() {
        return "Third-party device status";
    }
}
