package BaiTapCodeptit.J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            students.add(new Student(sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("BAITAP.in"));
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; i++){
            assignments.add(new Assignment(i, sc.nextLine()));
        }
        sc = new Scanner(new File("NHOM.in"));
        for(int i = 1; i <= n; i++){
            String studentID = sc.next();
            String assigmentID = sc.next();
            Student student = students.stream().filter(x -> x.getStudentID().equals(studentID)).findFirst().orElse(null);
            Assignment assignment = assignments.stream().filter(x -> x.getAssigmentID().equals(assigmentID)).findFirst().orElse(null);
            groups.add(new Group(student, assignment));
        }
        groups.stream().sorted(Comparator.comparing(Group::getStudentID)).forEach(System.out::println);
    }
}
