import java.util.Locale;
import java.util.Scanner;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point a){
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            double[] a = new double[5];  // Chuyển từ int sang double
            for (int i = 1; i <= 4; i++)  // Bắt đầu từ i = 1
                a[i] = sc.nextDouble();
            Point x = new Point(a[1], a[2]);
            Point y = new Point(a[3], a[4]);
            System.out.printf("%.4f\n", x.distance(y));
        }
    }
}
