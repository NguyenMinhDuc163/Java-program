import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String stt, idx, name, classRoom, email, company;

    public Student(int stt, String idx, String name, String classRoom, String email, String company) {
        this.stt = String.format("%d", stt);
        this.idx = idx.trim();
        this.name = name.trim();
        this.classRoom = classRoom.trim();
        this.email = email.trim();
        this.company = company.trim();
    }

    public String getIdx() {
        return idx;
    }

    public String getCompany() {
        return company;
    }

    public String toString(){
        return stt + " " + idx + " " + name + " " + classRoom + " " + email + " " + company;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            students.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.sort((x, y) -> x.getIdx().compareTo(y.getIdx()));
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String tmp = sc.nextLine();
            students.stream().filter(x -> x.getCompany().equals(tmp)).forEach(System.out::println);
        }
    }
}
