import java.util.*;

import java.util.HashMap;

class Problem {
    private String idx,name,  birth, begin, end, realAchiev,prioritize, achiveRate;
    private int bonus, timeRunRate, rank = 1;
    public int time(String s){
        String []tmp = s.split(":");
        return Integer.parseInt(tmp[0]) * 3600 + Integer.parseInt(tmp[1]) * 60 + Integer.parseInt(tmp[2]);
    }
    public Problem(int idx,String name,  String birth, String begin, String end) {
        this.idx = String.format("VDV%02d", idx);
        this.name = name;
        this.birth = birth;
        this.begin = begin;
        this.end = end;
        int prior = 2021 - Integer.parseInt(birth.substring(6));
        if(prior > 32) {
            prioritize = "00:00:0" + 3;
            bonus = 3;
        }
        else if (prior >= 25){
            prioritize = "00:00:0" + 2;
            bonus = 2;
        }
        else if (prior >= 18) {
            prioritize = "00:00:0" + 1;
            bonus = 1;
        }
        else {
            prioritize = "00:00:00";
            bonus = 0;
        }
        int timeRun = time(end) - time(begin);
        timeRunRate = timeRun - bonus;
        this.realAchiev = String.format("%02d:%02d:%02d", timeRun / 3600 , (timeRun % 3600) / 60, (timeRun % 3600 % 60));
        this.achiveRate = String.format("%02d:%02d:%02d", timeRunRate / 3600 , (timeRunRate % 3600) / 60, (timeRunRate % 3600 % 60));
    }

    public int getTimeRunRate() {
        return timeRunRate;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        return String.format("%s %s %s %s %s %d", idx, name, realAchiev, "00:00:0" + bonus, achiveRate, rank) ;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Problem> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            a.add(new Problem(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((x, y) -> Integer.compare(x.getTimeRunRate(), y.getTimeRunRate()));
        int currentRank = 1;
        for(int i = 1; i < a.size(); i++){
            if(a.get(i).getTimeRunRate() > a.get(i - 1).getTimeRunRate())
                currentRank = i + 1;
            a.get(i).setRank(currentRank);
        }
        a.forEach(System.out::println);
    }
}
