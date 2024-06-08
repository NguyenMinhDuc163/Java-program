package BaiTapCodeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
