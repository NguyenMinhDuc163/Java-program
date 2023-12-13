import java.util.Locale;
import java.util.Scanner;
 class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcEdge(Point a){
        return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            Point []a = new Point[3];
            for(int i = 0; i < 3; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                a[i] = new Point(x, y);
            }
            double x = a[0].calcEdge(a[1]);
            double y = a[0].calcEdge(a[2]);
            double z = a[2].calcEdge(a[1]);
            double S = 1 / 4f * Math.sqrt((x + y + z) * (x + y - z) * (x - y + z) * (-x + y + z));
            double R = (x * y * z) / (4 * S);
            double ans = Math.PI * R * R;
            if(x + y > z && x + z > y && y + z > x )
                System.out.printf("%.3f\n", ans);
            else System.out.println("INVALID");
        }
    }
}
