import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
class Student {
    private String idx, name, birth;
    private double d1, d2, d3;

    public Student(int idx, String name, String birth, double d1, double d2, double d3) {
        this.idx = String.format("%d",idx);
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getGpa(){
        return d1 +d2 + d3;
    }
    public String toString(){
        return idx + " " + name + " " + birth + " " + String.format("%.1f", d1 +d2 + d3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Student > students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        students.sort((x, y)-> Double.compare(y.getGpa(), x.getGpa()));
        students.stream().filter(x -> x.getGpa() == students.get(0).getGpa()).forEach(System.out::println);
    }
}
