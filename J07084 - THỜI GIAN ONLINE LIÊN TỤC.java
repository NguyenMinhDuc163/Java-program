package codeptit;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author DELL
 */
class Client{
    private String name, startTime, endTime;
    private long timeDifference;

    public Client(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        setTimeDifference();
    }
    public void setTimeDifference(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            Date date1 = format.parse(startTime);
            Date date2 = format.parse(endTime);
            this.timeDifference = (date2.getTime() - date1.getTime()) / 60000;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getName() {
        return name;
    }

    public long getTimeDifference() {
        return timeDifference;
    }

    @Override
    public String toString() {
        return name + " " + timeDifference;
    }
    
}
public class J07084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Client> clients = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            clients.add(new Client(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        clients.stream().sorted(Comparator.comparing(Client::getTimeDifference).reversed().thenComparing(Client::getName)).forEach(System.out::println);
    }
}
