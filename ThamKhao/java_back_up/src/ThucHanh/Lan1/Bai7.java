package thuchanh;
import java.io.*;
import java.util.*;

class Student{
    private String idx, name, classRoom, email, phoneNum;

    public Student(String idx, String name, String classRoom, String email, String phoneNum) {
        this.idx = idx;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getIdx() {
        return idx;
    }

    public String getClassRoom() {
        return classRoom;
    }

    @Override
    public String toString() {
        return String.join(" ",idx, name, classRoom, email, "0" + phoneNum);
    }
}
public class Bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        sc.useLocale(Locale.US);
        List<Student> students = new ArrayList<>();
        while(sc.hasNextLine()){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.stream().sorted(Comparator.comparing(Student::getClassRoom).thenComparing(Student::getIdx))
                .forEach(System.out::println);
    }
}
