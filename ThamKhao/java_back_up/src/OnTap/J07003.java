package OnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = "";
        if(sc.hasNextLine()) s = sc.nextLine();
        while(s.length() > 1){
             s = new BigInteger(s.substring(0, s.length() / 2)).add(new BigInteger(s.substring(s.length() / 2))).toString();
            System.out.println(s);
        }
    }
}
