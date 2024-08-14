package module1_1b;

public class BankingApp {
	public static void main(String[] args) {
        // Get the login state instance
        UserLoginState loginState = UserLoginState.getInstance();

        // Simulate user actions
        loginState.login();
        if (loginState.isLoggedIn()) {
            System.out.println("Viewing account balance...");
            // Perform other banking operations
        } else {
            System.out.println("Please log in to access banking features.");
        }

        // Simulate user logout
        loginState.logout();
    }
}

