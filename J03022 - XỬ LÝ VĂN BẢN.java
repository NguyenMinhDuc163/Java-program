package codeptit;
import java.io.*;
import java.util.*;

public class J03022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String tmp = "";
        while(sc.hasNextLine()){
            tmp += sc.nextLine().toLowerCase() + " ";
        }
        tmp = tmp.replaceAll("\\s+"," ");
        String []res = tmp.replaceAll("[?!]",".").split("\\.");
        for(String x: res){
           x = x.trim();
           try {
               System.out.println(x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase());
           }catch (Exception e){

           }

        }

    }
}
