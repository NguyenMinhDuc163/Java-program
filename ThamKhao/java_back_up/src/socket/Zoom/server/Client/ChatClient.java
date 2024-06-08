package socket.Zoom.server.Client;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChatClient {
    private static final String URL = "localhost";
    private static final int PORT = 5000;

    public void startClient(){
        try {
            Socket socket = new Socket(URL, PORT);

            //  doc dl lien tuc tu sv
            ClientListener client =  new ClientListener(socket);
            new Thread(client).start();
            // doc dl tu scanner
            OutputStream output = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            while(true){
                String message = sc.nextLine();
                output.write(message.getBytes());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
