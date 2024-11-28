import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdminManager {
    private static final String FILE_PATH = "data/admins.txt";

    public static boolean verifyCredentials(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading admin file: " + e.getMessage());
        }
        return false;
    }
}