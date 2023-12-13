import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String idx, name;
    private int size;

    public Student(String idx, String name, int size) {
        this.idx = idx;
        this.name = name;
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public String getIdx() {
        return idx;
    }
    public String toString(){
        return idx + " " + name + " " + size;
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
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        students.sort((x, y) -> {
            if(x.getSize() != y.getSize())
                return Integer.compare(y.getSize(), x.getSize());
            else return x.getIdx().compareTo(y.getIdx());
        });
        students.forEach(System.out::println);
    }
}
