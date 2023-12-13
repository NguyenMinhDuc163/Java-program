import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String idx, name, rank;
    private double theory, practice, totalGpa;

    public Student(int idx, String name, double theory, double practice) {
        this.idx = String.format("TS%02d", idx);
        this.name = name;
        this.theory = theory;
        this.practice = practice;
        if(theory > 10) this.theory = theory / 10 ;
        if(practice > 10) this.practice = practice / 10;
        setRank();
    }

    public double getTotalGpa() {
        return totalGpa;
    }

    public double getTheory() {
        return theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setRank(){
        totalGpa = (theory + practice) / 2;
        if(totalGpa < 5) rank = "TRUOT";
        else if(totalGpa < 8) rank = "CAN NHAC";
        else if(totalGpa < 9.5) rank = "DAT";
        else rank = "XUAT SAC";
    }
    public String toString(){
        return String.format("%s %s %.2f %s", idx, name, totalGpa, rank);
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
            students.add(new Student(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        students.stream().sorted((x, y) -> Double.compare(y.getTotalGpa(), x.getTotalGpa())).forEach(System.out::println);
    }
}
