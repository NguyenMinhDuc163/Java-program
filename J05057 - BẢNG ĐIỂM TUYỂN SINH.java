import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Student {
    private String idx, name, status;
    private double d1, d2, d3, total;
    private static HashMap<String, Double> prior = new HashMap<>();
    public Student(String idx, String name, double d1, double d2, double d3) {
        this.idx = idx;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        prior.put("KV1", 0.5); prior.put("KV2", 1.0);
        prior.put("KV3", 2.5);
        total = 2 * d1 + d2 + d3;
        if(total + prior.get(idx.substring(0,3)) >= 24) status = "TRUNG TUYEN";
        else status = "TRUOT";
    }


    public String stdPoint(double n){
        if((n * 10) % 10 == 0) return String.valueOf((int) n);
        else return String.valueOf(n);
    }
    public String toString(){
        return String.format("%s %s %s %s %s", idx, name, stdPoint(prior.get(idx.substring(0,3))),stdPoint(total), status);
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
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        students.forEach(System.out::println);
    }
}
