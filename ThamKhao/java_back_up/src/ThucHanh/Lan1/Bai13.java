package thuchanh;
import java.io.*;
import java.util.*;
class Point{
    private Double x, y;

    public Point(int x, int y) {
        this.x = x * 1.0;
        this.y = y * 1.0;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
class Polygon{
    private Point []p;

    public Polygon(Point []p) {
        this.p = p;
    }
    public  String getArea(){
        int n = p.length;
        double res = p[n - 1].getX() * p[0].getY() - p[n - 1].getY() * p[0].getX();
        for(int i = 0; i < n - 1; i++){
            res += p[i].getX() * p[i + 1].getY() - p[i].getY() * p[i + 1].getX();
        }
        return String.format("%.3f", Math.abs(res) / 2);
    }
}
public class Bai13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
