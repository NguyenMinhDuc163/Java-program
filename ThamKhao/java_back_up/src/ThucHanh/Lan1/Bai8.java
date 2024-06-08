package thuchanh;
import java.io.*;
import java.util.*;
public class Bai8 {
    public static String stdName(String name){
        String []s = name.trim().toLowerCase().split("\\s+");
        return String.join(" ",s);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        sc.useLocale(Locale.US);
        Map<String, Integer> mp = new HashMap<>();
        Set<String> se = new LinkedHashSet<>();
        while (sc.hasNextLine()){
            String tmp = stdName(sc.nextLine());
            se.add(tmp);
        }
        List<String> name = new ArrayList<>(se);
        for(int i = 0; i < name.size(); i++){
            String []s = name.get(i).split("\\s+");
            String tmp = s[s.length - 1];
            for(int j = 0; j < s.length - 1; j++){
                tmp += s[j].charAt(0);
            }
            mp.put(tmp, mp.getOrDefault(tmp, 0) + 1);
            if(mp.get(tmp) > 1)
                System.out.println(tmp + mp.get(tmp) + "@ptit.edu.vn");
            else System.out.println(tmp + "@ptit.edu.vn");
        }
    }
}
