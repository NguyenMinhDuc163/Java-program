import java.io.*;
import java.util.*;

public class J07037 {
    static class Enterprise{
        private final String idx, name;
        private final int quantity;

        public Enterprise(String idx, String name, int quantity) {
            this.idx = idx;
            this.name = name;
            this.quantity = quantity;
        }

        public String getIdx() {
            return idx;
        }

        @Override
        public String toString() {
            return String.format("%s %s %d", idx, name, quantity);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        List<Enterprise> enterprises = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            enterprises.add(new Enterprise(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        enterprises.stream().sorted(Comparator.comparing(Enterprise::getIdx)).forEach(System.out::println);
    }
}
