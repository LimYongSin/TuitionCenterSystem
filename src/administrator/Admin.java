public class Admin {
    private String username;

    // Constructor to initialize the admin with the username
    public Admin(String username) {
        this.username = username;
    }

    // Method to simulate managing operations
    public void manageOperations() {
        System.out.println("Welcome, " + username + "! You can now manage the tuition center's operations.");
        // Further operations related to admin can be added here
    }

    // Getter for username (if you need it elsewhere)
    public String getUsername() {
        return username;
    }

    // Setter for username (if you need to change it)
    public void setUsername(String username) {
        this.username = username;
    }
}