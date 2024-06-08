package socket.SendFIle;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Send");
        out.close();
        socket.close();


        ServerSocket serverSocket = new ServerSocket(54321);
        Socket socketReceive = serverSocket.accept();
        InputStream in = socketReceive.getInputStream();
        // noi luu file
        FileOutputStream outFile = new FileOutputStream("D://work_space_java//src//socket//SendFIle//Client//test.png");
        byte[] buffer = new byte[1024];
        int count = 0;
        while((count = in.read(buffer)) >= 0){
            outFile.write(buffer, 0, count);
        }
        socketReceive.close();
        socket.close();
        in.close();
        out.close();
    }
}
