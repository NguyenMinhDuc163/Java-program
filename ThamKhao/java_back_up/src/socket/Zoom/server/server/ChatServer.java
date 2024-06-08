package socket.Zoom.server.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static final int PORT = 5000;
    private List<ClientHandl> clients = new ArrayList<>();

    public void startServer(){
        try {
            // web socket
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started. Listening on port: "+PORT);

            // cac client ket noi voi sv
            while(true){
                Socket clinetSocket = serverSocket.accept();
                System.out.println("new client connected " + clinetSocket.getInetAddress().getHostAddress());

                ClientHandl clientHandl = new ClientHandl(clinetSocket, this, System.currentTimeMillis() + "");
                clients.add(clientHandl);
                new Thread(clientHandl).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void broadcastMessage(String id, String message){
        for(ClientHandl client: clients){
            if(!client.getId().equals(id)) // de tranh gui lai tn cua minh cho minh
                client.sendMessage(id + " " + message);
        }
    }
}
