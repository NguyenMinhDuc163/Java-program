import java.util.Locale;
import java.util.Scanner;
 class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcEdge(Point a){
        return Math.sqrt((Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2)));
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
            if(x + y > z && x + z > y && y + z > x && x * y * z > 0)
                System.out.printf("%.3f\n", x + y + z);
            else System.out.println("INVALID");
        }
    }
}
