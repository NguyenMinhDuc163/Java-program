package ThucHanh.Lan1;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CODE.cpp."));
        sc.useLocale(Locale.US);
        int cnt = 0;
        Pattern pattern = Pattern.compile("int(\\[\\])?\\S+\\w+\\s*(\\[\\])?\\s*[;,=]");
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            Matcher matcher = pattern.matcher(s);
            while(matcher.find()){
                cnt++;
            }
        }
        System.out.println(cnt * 4);
    }
}
