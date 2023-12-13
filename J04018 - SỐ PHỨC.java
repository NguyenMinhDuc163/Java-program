import java.util.Locale;
import java.util.Scanner;
import java.lang.ref.SoftReference;
import java.util.HashMap;

 class Problem {
    private int real, virtual;

    public Problem() {
    }

    public Problem(int real, int virtual) {
        this.real = real;
        this.virtual = virtual;
    }
    public Problem add(Problem a){
        Problem ans = new Problem();
        ans.real = real + a.real;
        ans.virtual = virtual + a.virtual;
        return ans;
    }

    public Problem mul(Problem a){
        Problem ans = new Problem();
        ans.real = (real * a.real - virtual * a.virtual) ;
        ans.virtual = (real * a.virtual + virtual * a.real);
        return ans;
    }
    public String toString(){
        String status = "";
        if(virtual >= 0) status = " + ";
        else status = " - ";
        return real + status + Math.abs(virtual) + "i";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            Problem []a = new Problem[2];
            for(int i = 0; i < 2; i++){
                a[i] = new Problem(sc.nextInt(), sc.nextInt());
            }
            Problem tmp = a[0].add(a[1]);
            Problem C = tmp.mul(a[0]);
            Problem D = a[0].add(a[1]).mul(a[0].add(a[1]));
            System.out.println(C + ", " + D);
        }

    }
}
