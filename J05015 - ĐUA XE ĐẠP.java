import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class Problem {
    private String idx, name, unit, timeEnd;
    private double speed, totalTime;

    public Problem( String name, String unit, String timeEnd) {
        this.name = name;
        this.unit = unit;
        this.timeEnd = timeEnd;
        setIdx();
        setSpeed();
    }
    public String shortCut(String s){
        String ans = "";
        String []tmp = s.split("\\s+");
        for(String  x: tmp){
            ans += x.substring(0,1);
        }
        return ans;
    }
    public void setSpeed(){
        String []time = timeEnd.split(":");
        double endTime = Integer.parseInt(time[0])  * 60 + Integer.parseInt(time[1]);
        totalTime =  (double) (endTime - 6 * 60) / 60;
        speed = Math.round(120.0 / totalTime);
    }
    public void setIdx(){
        idx = shortCut(unit)+ shortCut(name);
    }

    public double getTotalTime() {
        return totalTime;
    }

    public double getSpeed() {
        return speed;
    }

    public String toString(){
        return String.format("%s %s %s %.0f Km/h", idx, name, unit, speed);
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
            a.add(new Problem(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.stream().sorted((x, y)->Double.compare(x.getTotalTime(), y.getTotalTime())).forEach(System.out::println);
    }
}
