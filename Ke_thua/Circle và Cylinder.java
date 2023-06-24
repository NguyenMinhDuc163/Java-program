/*
 * Cho lớp Circle và lớp Cylinder kế thừa từ lớp Circle, thiết kế 2 lớp trên theo thiết kế dưới đây.

image

Cho danh sách thông tin về bán kính, chiều cao và màu sắc của các hình trụ, bạn hãy tính và in ra thể tích của hình trụ (Lấy PI là 3.14) đó và sắp xếp giảm dần theo thể tích, nếu 2 hình trụ có cùng thể tính thì sắp xếp theo màu sắc tăng dần về thứ tự từ điển.

Input Format

Dòng 1 là N : số lượng hình trụ

N dòng tiếp theo mô tả hình trụ gồm : Màu sắc, bán kính, chiều cao

Constraints

1<=N<=1000

Màu sắc có một từ, bán kính và chiều cao không quá 1000.

Output Format

In ra danh sách hình trụ sau khi sắp xếp, chiều cao, bán kính và thể tích lấy 2 số sau dấu phẩy.
Sample Input 0

9
Red 19 104
White 13 156
White 16 168
Green 13 191
Grey 11 159
White 12 144
Green 11 182
Blue 14 194
White 14 131
Sample Output 0

Color : White
Height : 168.00
Radius : 16.00
Volume : 135045.12
-------------------
Color : Blue
Height : 194.00
Radius : 14.00
Volume : 119395.36
-------------------
Color : Red
Height : 104.00
Radius : 19.00
Volume : 117888.16
-------------------
Color : Green
Height : 191.00
Radius : 13.00
Volume : 101356.06
-------------------
Color : White
Height : 156.00
Radius : 13.00
Volume : 82782.96
-------------------
Color : White
Height : 131.00
Radius : 14.00
Volume : 80622.64
-------------------
Color : Green
Height : 182.00
Radius : 11.00
Volume : 69149.08
-------------------
Color : White
Height : 144.00
Radius : 12.00
Volume : 65111.04
-------------------
Color : Grey
Height : 159.00
Radius : 11.00
Volume : 60410.46
-------------------
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;
 class Circle {
    protected double radius ;
    protected String color ;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return "Color : " + color + "\n";
    }
}
 class Cylinder extends Circle {
    private double height;

    public Cylinder(String color,double radius, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
    public String toString(){
        return super.toString() + "Height : " + String.format("%.2f", height) +
                "\n" + "Radius : " + String.format("%.2f",radius) + "\n" + "Volume : " + String.format("%.2f",getVolume());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Cylinder> ans = new ArrayList<>();
        for(int i = 1; i <= n ;i++){
            String []s = sc.nextLine().split(" ");
            ans.add(new Cylinder(s[0],Double.parseDouble(s[1]), Double.parseDouble(s[2])));
        }
        ans.sort((a, b) -> {
            if(a.getVolume() != b.getVolume())
                return Double.compare(b.getVolume(),a.getVolume());
            else return a.getColor().toLowerCase().compareTo(b.getColor().toLowerCase());
        });
        for(Cylinder x: ans){
            System.out.println(x);
            System.out.println("-------------------");
        }
    }
}
