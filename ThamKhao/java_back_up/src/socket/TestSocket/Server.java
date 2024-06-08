package socket.TestSocket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            // tao server va lang nghe
            int port  = 99;
            ServerSocket serverSocket = new ServerSocket(port);

            // chap nhan ket noi
            while(true){
                // chap nhan ket noi cua 1 client
                Socket socketClient = serverSocket.accept();
                MyProcess mp = new MyProcess(socketClient);
                mp.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
