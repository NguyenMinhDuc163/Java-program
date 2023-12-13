import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.HashMap;

class Problem {
    private String idx, name;
    private int price;

    public Problem(String idx, String name, int price) {
        this.idx = idx;
        this.name = name;
        this.price = price;
    }

    public String getIdx() {
        return idx;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Problem> a = new ArrayList<>();
        IntStream.rangeClosed(1, n).forEach(i -> {
            sc.nextLine();
            a.add(new Problem(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        });
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String tmp = sc.nextLine();
            String []s = tmp.split("\\s+");
            for(Problem x: a){
                if(s[0].contains(x.getIdx())){
                    System.out.print(s[0] + " ");
                    System.out.print(x + " ");
                    System.out.println((x.getPrice() * Integer.parseInt(s[1])));
                }

            }
        }
    }

}
