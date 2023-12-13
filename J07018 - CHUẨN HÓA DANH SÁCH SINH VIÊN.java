package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Student{
    private String idx, name, classRoom, birth;
    private double gpa;

    public Student(int idx, String name, String classRoom, String birth, double gpa) {
        this.idx = String.format("B20DCCN%03d", idx);
        this.name = stdName(name);
        this.classRoom = classRoom;
        this.birth = stdBirth(birth);
        this.gpa = gpa;
    }
    public String stdName(String name){
        String []s = name.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public String stdBirth(String birth){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/') sb.insert(0,"0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
    @Override
    public String toString() {
        return String.join(" ",idx, name, classRoom, birth, String.format("%.2f", gpa));
    }
}
public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        // sc.useLocale(Locale.US);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        students.forEach(System.out::println);
    }
}
