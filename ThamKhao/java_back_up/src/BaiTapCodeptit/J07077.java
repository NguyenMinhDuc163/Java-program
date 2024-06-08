package BaiTapCodeptit;
import java.util.*;
import java.lang.*;
import java.io.*;

class J07077 {
    static Vector<String> num;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            implement(sc);
            System.out.println();
        }
        sc.close();
    }

    static int level(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        if (c == '^')
            return 3;
        return 0;
    }

    static void tranfer(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                StringBuilder tmp = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    tmp.append(s.charAt(i));
                    i++;
                }
                i--;
                num.add(tmp.toString());
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'
                    || s.charAt(i) == '^') {
                while (!st.empty() && level(st.peek()) >= level(s.charAt(i))) {
                    num.add(Character.toString(st.peek()));
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == '(')
                st.push(s.charAt(i));
            if (s.charAt(i) == ')') {
                while (st.peek() != '(') {
                    num.add(Character.toString(st.peek()));
                    st.pop();
                }
                st.pop();
            }
        }
        while (!st.empty()) {
            if (st.peek() != '(')
                num.add(Character.toString(st.peek()));
            st.pop();
        }
    }

    static int calc(int a, int b, String c) {
        if (c.equals("+"))
            return a + b;
        if (c.equals("-"))
            return a - b;
        if (c.equals("*"))
            return a * b;
        if (c.equals("/"))
            return a / b;
        return 0;
    }

    static int transNum(String s) {
        int ans = 0;
        for (char x : s.toCharArray()) {
            ans = ans * 10 + (x - '0');
        }
        return ans;
    }

    static boolean isDigit(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    static int solve(String s) {
        tranfer(s);
        Stack<Integer> st = new Stack<>();
        for (String x : num) {
            if (!isDigit(x))
                st.push(transNum(x));
            else {
                int a = st.pop();
                int b = st.pop();
                int tmp = calc(b, a, x);
                st.push(tmp);
            }
        }
        return st.pop();
    }

    static void implement(Scanner sc) {
        num = new Vector<>();
        String s = sc.next();
        System.out.print(solve(s));
    }
}
