import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000); // connect to server
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = br.readLine();
                out.println(message); // send to server

                String response = in.readLine(); // read server response
                System.out.println(response);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            socket.close();
            System.out.println("Client closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 