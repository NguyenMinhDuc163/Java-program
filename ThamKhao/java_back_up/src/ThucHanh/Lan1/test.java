//import java.util.*;
//
//public class codeptit.J07028.TEST.test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        scanner.nextLine(); // Đọc bỏ dòng trống sau số lượng bộ codeptit.J07028.TEST.test
//
//        for (int t = 0; t < T; t++) {
//            String expression = scanner.nextLine();
//            int[] result = numberParenthesesPairs(expression);
//            for (int i = 0; i < result.length; i++) {
//                System.out.print(result[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int[] numberParenthesesPairs(String expression) {
//        int[] result = new int[expression.length()];
//        Stack<Integer> stack = new Stack<>();
//        int count = 0;
//
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//            if (c == '(') {
//                stack.push(count);
//                result[i] = count + 1;
//                count++;
//            } else if (c == ')') {
//                result[i] = stack.pop();
//            }
//        }
//
//        return result;
//    }
//}
