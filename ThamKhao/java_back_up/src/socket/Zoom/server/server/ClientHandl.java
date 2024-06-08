package socket.Zoom.server.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandl implements Runnable{
    private Socket socket;
    private ChatServer chatServer;
    private String id;
    private InputStream input;
    private OutputStream output;

    public ClientHandl(Socket socket, ChatServer chatServer, String id) {
        this.socket = socket;
        this.chatServer = chatServer;
        this.id = id;

        try {
            this.input = socket.getInputStream();
            this.output = socket.getOutputStream();
        }catch (Exception e){

        }
    }

    public void sendMessage(String message){
        try {
            output.write(message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public void run() {
        try{
            byte []buffer = new byte[1024];
            int byteBead;
            while((byteBead =  input.read(buffer))  != -1){
                String message = new String(buffer, 0, byteBead);
                chatServer.broadcastMessage(this.id, message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
