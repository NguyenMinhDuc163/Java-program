package BaiTapCodeptit;

import java.io.*;
import java.util.*;

class Subject{
    private String idx, name, exam;

    public Subject(String idx, String name, String exam) {
        this.idx = idx;
        this.name = name;
        this.exam = exam;
    }

    public String getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", idx, name, exam);
    }
    
}
public class J07058 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Subject> subjects = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        subjects.stream().sorted(Comparator.comparing(Subject::getIdx)).forEach(System.out::println);
    }
}
