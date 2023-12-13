package codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
class Student{
    private String idx, name, phoneNum, email;

    public Student(String idx, String name, String phoneNum, String email) {
        this.idx = idx;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getIdx() {
        return idx;
    }

    public String getName() {
        String []s = name.trim().split("\\s+");
        String res = s[s.length - 1] + s[0];
        for(int i = 1; i < s.length - 1; i++){
            res += s[i];
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", idx, name, phoneNum, email);
    }
    
}
public class J07081 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getIdx)).forEach(System.out::println);
    }
}
