package ThucHanh.Lan1;
import java.io.*;
import java.util.*;
public class DauNgoac {
    public static void solve(String s){
        Stack<Integer> stack = new Stack<>();
        int bracketNumber = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                bracketNumber++;
                stack.push(bracketNumber);
                System.out.print(bracketNumber + " ");
            } else if (c == ')') {
                System.out.print(stack.pop() + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String s = sc.nextLine();
            solve(s);
            System.out.println();
        }
    }
}
