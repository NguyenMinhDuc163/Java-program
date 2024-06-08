package OnTap.J05071;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n =Integer.parseInt(sc.nextLine());
        HashMap<String, City> citys = new HashMap<>();
        ArrayList<Phone> phones = new ArrayList<>();
        for(int i = 1; i <= n; i ++){
            String idx = sc.nextLine();
            citys.put(idx, new City(idx,  sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().trim().split("\\s+");
            if(s[0].charAt(0) == '0'){
                City city = citys.get(s[0].substring(1,3));
                phones.add(new Phone(s[0], s[1], s[2], city));
            }
            else {
                phones.add(new Phone(s[0], s[1], s[2]));
            }
        }
        phones.forEach(System.out::println);
    }
}
