import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String idx, name, nganh;

    public Student(int idx, String name, String nganh) {
        this.name = name;
        this.nganh = nganh;
        this.idx = String.format("GV%02d", idx);
    }

    public String getName() {
        String []s = name.split("\\s+");
        return s[s.length - 1];
    }

    public String getIdx() {
        return idx;
    }
    public String toString(){
        String tmp = "";
        for(String x: nganh.split("\\s+")){
            tmp += "" + Character.toUpperCase(x.charAt(0));
        }
        return idx + " " + name + " " + tmp;
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
            students.add(new Student(i, sc.nextLine(), sc.nextLine()));
        }
        students.sort((x, y) -> x.getName().compareTo(y.getName()));
        students.forEach(System.out::println);
    }
}
