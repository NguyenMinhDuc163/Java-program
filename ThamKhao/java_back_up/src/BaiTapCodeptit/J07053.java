package BaiTapCodeptit;

import java.io.*;
import java.util.*;
class Candidate{
    private String idx, name, birth, status;
    private double theory, practice, bonus, totalScore;
    private int age;

    public Candidate(int idx, String name, String birth, double theory, double practice) {
        this.idx = String.format("PH%02d", idx);
        this.name = name;
        this.birth = birth;
        this.theory = theory;
        this.practice = practice;
        setBonus(); stdName();
        setStatus(); 
    }
    public void setBonus(){
        if(theory >= 8 && practice >= 8) bonus = 1;
        else if(theory >= 7.5 && practice >= 7.5) bonus = 0.5;
        else bonus = 0;
    }
    public void setStatus(){
        this.totalScore = (double) Math.round((double) (theory + practice) / 2 + bonus);
        if(totalScore > 10) totalScore = 10;
        if(totalScore < 5) status = "Truot";
        else if(totalScore <= 6) status = "Trung binh";
        else if(totalScore <= 7) status = "Kha";
        else if(totalScore <= 8) status = "Gioi";
        else status = "Xuat sac";
        age = 2021 - Integer.parseInt(birth.substring(birth.length() - 4));
    }
    public void stdName(){
        String s[] = this.name.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %.0f %s", idx, name, age, totalScore, status);
    }
    
}
public class J07053 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        List<Candidate> candidates = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            candidates.add(new Candidate(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        candidates.forEach(System.out::println);
    }
}
