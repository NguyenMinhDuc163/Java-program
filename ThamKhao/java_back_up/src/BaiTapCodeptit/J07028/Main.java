package BaiTapCodeptit.J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<Subject> subjects = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Hour> hours = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String []s = sc.nextLine().split(" ", 2);
            subjects.add(new Subject(s[0], s[1]));
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().split(" ", 2);
            teachers.add(new Teacher(s[0], s[1]));
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split(" ", 3);
            Subject subject = subjects.stream().filter(x -> x.getSubjectID().equals(s[1])).findFirst().orElse(null);
            Teacher teacher = teachers.stream().filter(x -> x.getTeacherID().equals(s[0])).findFirst().orElse(null);
            hours.add(new Hour(teacher, subject, s[2]));

        }
        hours.forEach(System.out::println);
    }
}
