import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Số phần tử của dãy a[]
        int m = scanner.nextInt(); // Số phần tử của dãy b[]

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();

        // Đọc dãy số a[] và đếm số lần xuất hiện
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            mapA.put(x, mapA.getOrDefault(x, 0) + 1);
        }

        // Đọc dãy số b[] và đếm số lần xuất hiện
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            mapB.put(x, mapB.getOrDefault(x, 0) + 1);
        }

        // Tìm tập giao của hai Map
        Set<Integer> intersection = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
            if (mapB.containsKey(entry.getKey())) {
                intersection.add(entry.getKey());
            }
        }

        // In ra tập giao
        for (Integer num : intersection) {
            System.out.print(num + " ");
        }
    }
}
