package socket.Zoom.server.Client;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientListener implements Runnable{
    private Socket socket;
    private InputStream input;

    public ClientListener(Socket socket) {
        this.socket = socket;
        try{
            this.input = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int byteRead;
            while((byteRead = input.read(buffer)) != -1){
                String message =  new String(buffer, 0, byteRead);
                System.out.println(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
