import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        HashMap<String , Integer> mp = new HashMap<>();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().toLowerCase().split("\\s+");
            ArrayList<String> ans = new ArrayList<>();
            for (String x : s) {
                if (x.length() > 0) {
                    String tmp = x.substring(0,1) + x.substring(1);
                    ans.add(tmp);
                }
            }
            String tmp = ans.get(ans.size() - 1);
            for(int i = 0; i < ans.size() - 1; i++){
                tmp += ans.get(i).charAt(0);
            }
            mp.put(tmp, mp.getOrDefault(tmp, 0) + 1);
            System.out.print(tmp);
            if(mp.get(tmp) > 1) System.out.println(mp.get(tmp) + "@ptit.edu.vn");
            else System.out.println("@ptit.edu.vn");
        }
    }
}
