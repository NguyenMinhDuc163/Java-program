package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
class Student{
    private String idx, name, classRoom, birth;
    private double gpa;

    public Student(int idx, String name, String classRoom, String birth, double gpa) {
        this.idx = String.format("B20DCCN%03d", idx);
        this.name = name;
        this.classRoom = classRoom;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void stdBirth(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/') sb.insert(0,"0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }

    @Override
    public String toString() {
        stdBirth();
        return String.format("%s %s %s %s %.2f", idx, name, classRoom, birth, gpa);
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        students.forEach(System.out::println);
    }
}
