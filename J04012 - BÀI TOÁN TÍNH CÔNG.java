import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
 class Problem {
    private String idx, name, positon;
    private int wage, wordDay,bonus;
    private static HashMap<String, Integer> allowAnce = new HashMap<>();

    public Problem(int idx, String name, String positon, int wage, int wordDay) {
        this.idx = String.format("NV%02d", idx);
        this.name = name;
        this.positon = positon;
        this.wage = wage;
        this.wordDay = wordDay;
        allowAnce.put("GD",250000);
        allowAnce.put("PGD",200000);
        allowAnce.put("TP",180000);
        allowAnce.put("NV",150000);
        if(wordDay >= 25) bonus = wage * wordDay / 5;
        if(wordDay > 22 && wordDay < 25) bonus = wage * wordDay / 10;
    }
    public int sagary(){
        return wage * wordDay + bonus + allowAnce.get(positon);
    }
    public String toString(){
        return idx + " " + name + " " + wage * wordDay + " " + bonus + " " + allowAnce.get(positon) + " " + sagary();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String name = sc.nextLine();
        int wage = sc.nextInt();
        int wordDay = sc.nextInt();
        sc.nextLine();
        String posison = sc.nextLine();
        Problem a = new Problem(1, name, posison, wage, wordDay);
        System.out.println(a);
    }
}
