import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.HashMap;

class Problem {
    private String idx, name, battle;
    private int price, income;

    public Problem(String idx, String name, int price) {
        this.idx = idx;
        this.name = name;
        this.price = price;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setBattle(String battle) {
        this.battle = battle;
    }

    public String getIdx() {
        return idx;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public String toString(){
        return String.format("%s %s %s", battle, name, income);
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
                    x.setBattle(s[0]);
                    x.setIncome(x.getPrice() * Integer.parseInt(s[1]));
                }
            }
        }
        a.stream().sorted((x, y) ->{
            if(x.getIncome() != y.getIncome())
                return Integer.compare(y.getIncome(), x.getIncome());
            else return x.getName().compareTo(y.getName());
        }).forEach(System.out::println);
    }

}
