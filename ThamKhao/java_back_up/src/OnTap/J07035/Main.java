package OnTap.J07035;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String,ArrayList<ScoreTable>> scoreTables = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String idx = sc.nextLine();
            students.put(idx, new Student(idx, sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String idx = sc.nextLine();
            subjects.put(idx, new Subject(idx, sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split("\\s+");
            Student student = students.get(s[0]);
            Subject subject = subjects.get(s[1]);
            scoreTables.put(s[1], scoreTables.getOrDefault(s[1],  new ArrayList<>()));
            scoreTables.get(s[1]).add(new ScoreTable(student, subject, s[2]));
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String idx = sc.nextLine();
            System.out.println("BANG DIEM MON " + subjects.get(idx) +  ":");
            scoreTables.get(idx).stream().sorted(Comparator.comparing(ScoreTable::getScore).reversed()
                    .thenComparing(ScoreTable::getStudentID)).forEach(System.out::println);
        }
    }
}
