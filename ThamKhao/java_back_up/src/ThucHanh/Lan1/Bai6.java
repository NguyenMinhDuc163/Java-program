package ThucHanh.Lan1;
import java.io.*;
import java.util.*;
public class Bai6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        long sum = 0;
        while(sc.hasNext()){
            try {
                String s = sc.next();
                if(s.length() > 9){
                    sum += Long.parseLong(s);
                }
            }catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
