import java.io.IOException;

public class ThrowsExample {
    // Method declares that it might throw an IOException
    static void checkFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            checkFile(); // calling the method that throws exception
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}