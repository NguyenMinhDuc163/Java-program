import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;

class Student {
    private String name, status;
    private double score, Practise;
    private int idx;

    public Student(int idx, String name, double score, double practise) {
        this.idx = idx;
        this.name = name;
        this.score = score;
        Practise = practise;
    }

    public int getIdx() {
        return idx;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getScore() {
        return score;
    }

    public double getPractise() {
        return Practise;
    }

    public String toString(){
        return String.format("%s: %s", name, status);
    }
}
public class Main {
    public static String  isHoBo(double score, double practise){
        if(score >= 3.6 && practise >= 90) return "XUATSAC";
        else if (score >= 3.2 && practise >= 80) return "GIOI";
        else if(score >= 2.5 && practise >= 70) return "KHA";
        else return "KHONG";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            students.add(new Student(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        double gpa = 5;
        students.sort((x, y) -> Double.compare(y.getScore(), x.getScore()));
        for(int i = 0; i < students.size(); i++){
            double score = students.get(i).getScore();
            double practise = students.get(i).getPractise();
            if(i < m){
                students.get(i).setStatus(isHoBo(score, practise));
                gpa = Math.min(gpa, students.get(i).getScore());
            }
            else students.get(i).setStatus("KHONG");
            if(m > 0 && i == m) gpa = Math.min(gpa, students.get(i - 1).getScore());
        }
        for(Student x: students){
            if(x.getScore() == gpa)
                x.setStatus(isHoBo(gpa, x.getPractise()));
        }
        students.sort((x, y) -> Integer.compare(x.getIdx(), y.getIdx()));
        students.forEach(System.out::println);
    }
}
