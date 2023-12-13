import java.util.Scanner;

public class Main {
    public static int minSquareArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int left = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int right = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int bottom = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int top = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        int side = Math.max(right - left, top - bottom);
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int result = minSquareArea(x1, y1, x2, y2, x3, y3, x4, y4);
        System.out.println(result);

        sc.close();
    }
}
