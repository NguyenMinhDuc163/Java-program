package socket.TestSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int port = 99;
        try {
            Socket socket = new Socket("localhost", port);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String message = "";
            while (true){
                // gui
                System.out.println("client: ");
                message = sc.nextLine();
                writer.println(message);
                writer.flush();

                // nhan
                message = reader.readLine();
                System.out.println("serve: " + message);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
