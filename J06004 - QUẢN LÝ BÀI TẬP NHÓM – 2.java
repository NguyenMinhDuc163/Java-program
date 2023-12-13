import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

class Student {
    private String idx, name, phoneNum,issue;
    private int stt;

    public Student(String idx, String name, String phoneNum, int stt) {
        this.idx = idx.trim();
        this.name = name;
        this.phoneNum = phoneNum;
        this.stt = stt;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        return String.format("%s %s %s %d %s", idx, name, phoneNum, stt, issue);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        LinkedHashMap<Integer, ArrayList<Student>> students = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            String idx = sc.nextLine();
            String name = sc.nextLine();
            String phoneName = sc.nextLine();
            int stt = sc.nextInt();
            students.putIfAbsent(stt, new ArrayList<>());
            students.get(stt).add(new Student(idx, name, phoneName, stt));
        }
        sc.nextLine();
        for(int i = 1; i <= m; i++){
            String problem = sc.nextLine();
            for(Student x: students.get(i))
                x.setIssue(problem);
        }
        ArrayList<Student> ans = new ArrayList<>();
        students.forEach((key, studentList) -> {
            ans.addAll(studentList);
        });
        ans.stream().sorted(Comparator.comparing(Student::getIdx)).forEach(System.out::println);

    }
}
