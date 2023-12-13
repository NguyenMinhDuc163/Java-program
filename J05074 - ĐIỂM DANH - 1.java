import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String idx, name, classRoom, note = "", attendance = "";
    private long score;

    public Student(String idx, String name, String classRoom) {
        this.idx = idx;
        this.name = name;
        this.classRoom = classRoom;
        solveScore();
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
        solveScore(); 
    }

    private void solveScore() {
        Map<Character, Long> mp = attendance.chars()
                .mapToObj(x -> (char) x)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        long mCount = mp.getOrDefault('m', 0L);
        long vCount = mp.getOrDefault('v', 0L);
        score = 10 - (mCount + vCount * 2);
        if (score <= 0) {
            note = "KDDK";
            score = 0;
        }
    }

    public String getIdx() {
        return idx;
    }

    public String toString() {
        return String.format("%s %s %s %d %s", idx, name, classRoom, score, note);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt

        ArrayList<Student> students = new ArrayList<>();
        IntStream.rangeClosed(1, n).forEach(i -> {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        });

        for (int i = 1; i <= n; i++) {
            String idx = sc.next();
            String cc = sc.next();
            for (Student x : students) {
                if (x.getIdx().equals(idx)) {
                    x.setAttendance(cc);
                    break;
                }
            }
        }

        students.forEach(System.out::println);
    }
}
