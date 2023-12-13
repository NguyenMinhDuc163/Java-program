import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

class Student {
    private String idx, name, phoneNum,issue;
    private int stt;

    public Student(String idx, String name, String phoneNum, int stt) {
        this.idx = idx;
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
    public String toString(){
        return String.format("%s %s %s", idx, name, phoneNum);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, ArrayList<Student>> students = new HashMap<>();
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
        int q = sc.nextInt();
        while(q --> 0){
            int t = sc.nextInt();
            System.out.println("DANH SACH NHOM " + t + ":");
            students.get(t).forEach(System.out::println);
            System.out.println("Bai tap dang ky: " + students.get(t).get(0).getIssue());
        }
    }
}
