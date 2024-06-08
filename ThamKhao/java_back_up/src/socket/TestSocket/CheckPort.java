package socket.TestSocket;

import java.net.Socket;

public class CheckPort {
    public static void main(String[] args) {
        checkPort("localhost");
    }
    public static void checkPort(String urlString){
        int startPort = 1;
        int endPort = 100000;
        System.out.println("Dang quet port may " + urlString);
        for(int i = startPort; i <= endPort; i++){
            try {
                Socket socket = new Socket(urlString, i);
                System.out.println("Cong " + i + " Dang mo");
                socket.close();
            }catch (Exception e){

            }
        }
    }
}
