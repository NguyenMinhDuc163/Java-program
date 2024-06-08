package ThucHanh.Lan2;
import java.io.*;
import java.util.*;
public class Bai5 {
    public static boolean isCheck(String s){
        boolean ok =false;
        for(Character x: s.toCharArray()){
            if(x == '.' || x == ',' || x == '!' || x == ':' || x == '?')
                return false;
            if(Character.isDigit(x))
                ok = true;
        }
        return ok;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        sc.useLocale(Locale.US);
        String tmp = "";
        while(sc.hasNextLine()){
            tmp += sc.nextLine();
        }
        Set<String> se = new TreeSet<>();
        String []s = tmp.split("\\s+");
        for(String x: s){
            if(isCheck(x))
                se.add(x);
        }
        se.forEach(System.out::println);
    }
}
