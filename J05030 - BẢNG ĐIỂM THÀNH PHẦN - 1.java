import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String idx, name, classRoom;
    private double d1, d2, d3;

    public Student(String idx, String name, String classRoom, double d1, double d2, double d3) {
        this.idx = idx;
        this.name = name;
        this.classRoom = classRoom;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        return idx + " " + name + " " + classRoom + String.format(" %.1f %.1f %.1f", d1, d2, d3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        students.sort((x, y) -> x.getIdx().compareTo(y.getIdx()));
        for(int i = 0; i < students.size(); i++){
            System.out.print((i + 1) + " ");
            System.out.println(students.get(i));
        }

    }
}
