package socket.Zoom.server.server;

public class ChatRoomServer {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.startServer();
    }
}
