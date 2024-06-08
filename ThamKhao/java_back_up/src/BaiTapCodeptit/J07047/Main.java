package BaiTapCodeptit.J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        HashMap<String, Room> rooms = new HashMap<>();
        ArrayList<Client> clients = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String []s = sc.nextLine().trim().split("\\s+");
            rooms.put(s[0], new Room(s[0], s[1], s[2], s[3]));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String name = sc.nextLine();
            String roomID = sc.nextLine();
            String checkIn =  sc.nextLine();
            String checkOut = sc.nextLine();
            Room room = rooms.get(roomID.substring(2, 3));
            clients.add(new Client(i,  name, roomID, checkIn, checkOut, room));
        }
        clients.stream().sorted(Comparator.comparing(Client::getDay).reversed()).forEach(System.out::println);
    }
}
