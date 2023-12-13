import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
class Student {
    private String idx, name, classRoom, email;

    public Student(String idx, String name, String classRoom, String email) {
        this.idx = idx;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        return idx + " " + name + " " + classRoom + " " + email;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ArrayList<Student> students = new ArrayList<>();
        while (sc.hasNext()){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.sort((x, y) -> x.getIdx().compareTo(y.getIdx()));
        students.forEach(System.out::println);
    }
}
