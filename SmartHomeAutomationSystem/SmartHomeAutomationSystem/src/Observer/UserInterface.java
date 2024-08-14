package Observer;

public class UserInterface implements Observer {
    @Override
    public void update(String deviceName, String status) {
        System.out.println("Device: " + deviceName + " is now " + status);
    }
}