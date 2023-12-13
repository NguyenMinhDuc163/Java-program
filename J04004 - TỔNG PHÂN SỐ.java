import java.util.Locale;
import java.util.Scanner;
 class Problem {
    private long a, b;
    public long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public Problem(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public void sum(Problem x){
        a = a * x.b + b * x.a;
        b = b * x.b;
    }


    public String toString(){
        return (a / gcd(a, b)) + "/" + (b / gcd(a, b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Problem a = new Problem(sc.nextLong(), sc.nextLong());
        Problem b = new Problem(sc.nextLong(), sc.nextLong());
        a.sum(b);
        System.out.println(a);
    }
}
