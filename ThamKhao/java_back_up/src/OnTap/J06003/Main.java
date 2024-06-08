package OnTap.J06003;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, ArrayList<Student>> students = new LinkedHashMap<>();
        Map<String, String> topic = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String idx = sc.nextLine();
            String name = sc.nextLine();
            String phoneNum = sc.nextLine();
            String group = sc.nextLine();
            students.put(group, students.getOrDefault(group, new ArrayList<>()));
            students.get(group).add(new Student(idx, name, phoneNum, group));
        }
        for(int i = 1; i <= m ;i++){
            topic.put(String.valueOf(i), sc.nextLine());
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String k = sc.nextLine();
            System.out.println("DANH SACH NHOM " + k + ":");
            students.get(k).forEach(System.out::println);
            System.out.println("Bai tap dang ky: " + topic.get(k));
        }
    }
}
