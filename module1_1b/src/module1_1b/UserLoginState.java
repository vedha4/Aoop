package module1_1b;

public class UserLoginState {
	private static UserLoginState instance;
    private boolean loggedIn; // Represents the login state

    // Private constructor to prevent direct instantiation
    private UserLoginState() {
        loggedIn = false; // Initially not logged in
    }

    // Get the singleton instance
    public static UserLoginState getInstance() {
        if (instance == null) {
            instance = new UserLoginState();
        }
        return instance;
    }

    // Methods to manage login state
    public void login() {
        loggedIn = true;
        System.out.println("User logged in successfully.");
    }

    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}

