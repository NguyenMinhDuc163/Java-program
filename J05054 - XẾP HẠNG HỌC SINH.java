import java.util.*;
import java.util.Arrays;

class Student {
    private String name, idx, gradeLevel;
    private double gpa;
    private int rank = 1;

    public Student(int idx,String name, double gpa) {
        this.idx = String.format("HS%02d", idx);
        this.name = name;
        this.gpa = gpa;
        if(gpa < 5) gradeLevel = "Yeu";
        else if(gpa < 7) gradeLevel = "Trung Binh";
        else if(gpa < 9) gradeLevel = "Kha";
        else gradeLevel = "Gioi";
    }

    public double getGpa() {
        return gpa;
    }

    public String getIdx() {
        return idx;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return String.format("%s %s %.1f %s %d", idx, name, gpa, gradeLevel, rank) ;
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
            students.add(new Student(i, sc.nextLine(), sc.nextDouble()));
        }
        students.sort((x, y) -> Double.compare(y.getGpa(), x.getGpa()));
        int currentRank = 1;
        for(int i = 1; i < students.size(); i++){
            if(students.get(i).getGpa() < students.get(i - 1).getGpa())
                currentRank = i + 1;
            students.get(i).setRank(currentRank);
        }
        students.sort((x, y) -> x.getIdx().compareTo(y.getIdx()));
        students.forEach(System.out::println);
    }
}
