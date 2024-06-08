package socket.SendFIle;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        if(in.readUTF().equals("Send")){
            System.out.println("da nhan");
            File file = new File("D://work_space_java//src//socket//SendFIle//Server//test.png");
            if(file.exists()){
                Socket socketSend = new Socket("localhost",54321);
                OutputStream out = socketSend.getOutputStream();
                FileInputStream inSend = new FileInputStream(file);
                byte [] buffer = new byte[1024];
                int cnt = 0;
                while((cnt = inSend.read(buffer)) >= 0){
                    out.write(buffer, 0, cnt);
                }
                System.out.println("success");
                out.close();
                socketSend.close();
                inSend.close();
            }
            else System.out.println("loi");
        }
        in.close();
        socket.close();
        serverSocket.close();
    }
}
