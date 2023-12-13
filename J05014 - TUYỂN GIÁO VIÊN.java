import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

 class Teacher {
    private String idx, name, code, status;
    private double infoTech, score, totalScore;
    private  static HashMap<String,String> subject = new HashMap<>(); // nhơ khoi tao
    private static HashMap<String,Double> prior = new HashMap<>();
    public Teacher(int idx, String name, String code, double infoTech, double score) {
        this.idx = String.format("GV%02d", idx);
        this.name = name;
        this.code = code;
        this.infoTech = infoTech;
        this.score = score;
        setInformation();
        setStatus();
    }
    public void setInformation(){
        subject.put("A", "TOAN");
        subject.put("B", "LY");
        subject.put("C", "HOA");
        prior.put("1", 2.0);
        prior.put("2", 1.5);
        prior.put("3", 1.0);
        prior.put("4", 0.0);
    }
    public void setStatus(){
        totalScore = infoTech * 2 + score + prior.get(code.substring(1));
        if(totalScore >= 18) status = "TRUNG TUYEN";
        else status = "LOAI";
    }

    public double getTotalScore() {
        return totalScore;
    }

    public String toString(){
        return String.format("%s %s %s %.1f %s", idx, name, subject.get(code.substring(0,1)), totalScore, status);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            teachers.add(new Teacher(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        teachers.stream().sorted((x, y) -> Double.compare(y.getTotalScore(), x.getTotalScore())).forEach(System.out::println);
    }
}
