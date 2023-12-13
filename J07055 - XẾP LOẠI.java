package codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
class Student{
    private String idx, name, rank;
    private Double d1, d2, d3, score;

    public Student(int idx, String name, Double d1, Double d2, Double d3) {
        this.idx = String.format("SV%02d", idx);
        this.name = stdName(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.score = (0.25 * d1 + 0.35 * d2 + d3 * 0.4);
        setRank();
    }
    public String stdName(String tmp){
        String []s = tmp.trim().split("\\s+");
        String res = "";
        for(String x : s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public Double getScore() {
        return score;
    }
    public void setRank(){
        if(score >= 8) rank = "GIOI";
        else if(score >= 6.5) rank = "KHA";
        else if(score >= 5) rank = "TRUNG BINH";
        else rank = "KEM";
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", idx, name, score, rank);
    }
    
}
public class J07055 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        students.stream().sorted(Comparator.comparing(Student::getScore).reversed()).forEach(System.out::println);
    }
}
