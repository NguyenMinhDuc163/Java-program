import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String idx, name, classRoom, email;

    public Student(String idx, String name, String classRoom, String email) {
        this.idx = idx;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
    }

    public String getClassRoom(){
        return this.classRoom;
    }

    public String toString(){
        return idx + " " + name + " " + classRoom + " " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student > students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            students.stream().filter(x -> x.getClassRoom().equals(lop)).forEach(System.out::println);
        }
    }
}
