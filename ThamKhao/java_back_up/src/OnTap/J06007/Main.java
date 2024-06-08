package OnTap.J06007;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Subject> sujects = new HashMap<>();
        Map<String, Teacher> teachers = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1;  i <= n; i++){
            String []s = sc.nextLine().split("\\s+", 2);
            sujects.put(s[0], new Subject(s[0], s[1]));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().split("\\s+", 2);
            teachers.put(s[0], new Teacher(s[0], s[1]));
        }
        int k = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split("\\s+");
            Teacher teacher = teachers.get(s[0]);
            Subject subject = sujects.get(s[1]);
            subject.setTime(s[2]);
            teacher.setTime(s[2]);
            teacher.setSubjects(subject);
        }
        double time = 0;
        String GV = sc.nextLine();
        System.out.println(teachers.get(GV));
        for(Subject x: teachers.get(GV).getSubjects()){
            System.out.println(x);
            time += x.getTime();
        }
        System.out.println("Tong: " + String.format("%.2f", time));
    }
}
