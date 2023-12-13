import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
class Client {
    private String idx, name, sex, birth, address;

    public Client(int idx, String name, String sex, String birth, String address) {
        this.idx = String.format("KH%03d", idx);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }

    public String getBirth() {
        normalizeBirth();
        String []s = birth.split("/");
        return s[2] + s[1] + s[0];
    }

    public void normalizeName(){
        String []s = name.trim().split("\\s+");
        String tmp = "";
        for(String x: s){
            tmp += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }

        this.name = tmp.trim();
    }

    public String getName() {
        return name;
    }

    public void normalizeBirth(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/') sb.insert(0,"0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }
    public String toString(){
        normalizeName();
        normalizeBirth();
        return String.format("%s %s %s %s %s", idx, name, sex, address, birth);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Client> clients = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        clients.stream().sorted((x, y) -> x.getBirth().compareTo(y.getBirth())).forEach(System.out::println);
    }
}
