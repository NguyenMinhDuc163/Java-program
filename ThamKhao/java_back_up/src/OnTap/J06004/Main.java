package OnTap.J06004;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        HashMap<Integer, String> topic = new HashMap<>();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 1; i <= m; i++){
            topic.put(i, sc.nextLine());
        }
        for(Student x: students){
            x.setTopic(topic.get(x.getGroup()));
        }
        students.stream().sorted(Comparator.comparing(Student::getStudentID)).forEach(System.out::println);
    }
}
