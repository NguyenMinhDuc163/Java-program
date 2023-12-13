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
        return this.nganh;
    }

    public String getNganh(){
        return this.nganh;
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

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String nganh = sc.nextLine();
            String tmp = "";
            for(String x: nganh.split("\\s+")){
                tmp += "" + Character.toUpperCase(x.charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            students.stream().filter(x -> x.getName().equals(nganh)).forEach(System.out::println);
        }
    }
}
