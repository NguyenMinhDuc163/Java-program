package socket.TestSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyProcess extends Thread{
    private Socket socket;
    public MyProcess(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer =  new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                // nhan tin nhan
                String message = reader.readLine();
                System.out.println("Client: " + message);

                // gui tn
                message = sc.nextLine();
                writer.println(message);
                writer.flush(); // chuyen ngay lap tuc
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
