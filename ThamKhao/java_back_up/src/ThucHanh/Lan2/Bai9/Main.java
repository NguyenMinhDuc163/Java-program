package ThucHanh.Lan2.Bai9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Student> students = new ArrayList<>();
        while(sc.hasNextLine()){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.stream().sorted(Comparator.comparing(Student::getClassRoom).thenComparing(Student::getStudentID))
                .forEach(System.out::println);
    }
}
