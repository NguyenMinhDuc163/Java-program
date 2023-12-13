package codeptit;

import java.io.*;
import java.util.*;

class Client{
    private String idx, name, sex, birth, address;

    public Client(int idx, String name, String sex, String birth, String address) {
        this.idx = String.format("KH%03d", idx);
        this.name = stdName(name);
        this.sex = sex;
        this.birth = stdBirth(birth);
        this.address = address;
    }
    public String stdName(String name){
        String []s = name.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public String stdBirth(String birth){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String getBirth() {
        String []s = birth.split("/");
        return s[2] + s[1] + s[0];
    }
    
    @Override
    public String toString() {
        return String.join(" ", idx, name, sex, address, birth);
    }
    
}
public class J07025 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Client> clients = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        clients.stream().sorted(Comparator.comparing(Client::getBirth)).forEach(System.out::println);
    }
}
