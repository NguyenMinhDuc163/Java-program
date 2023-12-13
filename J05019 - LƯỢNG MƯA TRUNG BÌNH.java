import java.util.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

class Problem {
    private String idx, name,  startTime, endTime;
    private double amountOfRan, averageRan, timeRan;

    public Problem(int idx, String name, String startTime, String endTime, double amountOfRan) {
        this.idx = String.format("T%02d",idx);
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.amountOfRan = amountOfRan;
        getTime();
    }

    public void getTime(){
        LocalTime start = LocalTime.parse(startTime);
        LocalTime ends = LocalTime.parse(endTime);
        Duration duration = Duration.between(start, ends);
        timeRan = (double) duration.toMinutes();
    }

    public double getAmountOfRan() {
        return amountOfRan;
    }


    public double getTimeRan() {
        return timeRan;
    }

    public String toString(){
        return String.format("%s %s ", idx, name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        LinkedHashMap<String, ArrayList<Problem>> avgRan = new LinkedHashMap<>();
        int stt = 0;
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String start = sc.nextLine();
            String ends = sc.nextLine();
            double ranMount = sc.nextDouble();
            if(avgRan.containsKey(name))
                avgRan.get(name).add(new Problem(stt, name, start, ends, ranMount));
            else {
                avgRan.put(name, new ArrayList<>());
                avgRan.get(name).add(new Problem(++stt, name,start, ends, ranMount));
            }
        }
        avgRan.forEach((x, y) -> {
            double timeRan = 0;
            double amoutRan = 0;
            for(Problem tmp : y){
                timeRan += tmp.getTimeRan();
                amoutRan += tmp.getAmountOfRan();
            }
            double ans = amoutRan * 60 / timeRan;
            System.out.print(y.get(0));
            System.out.printf("%.2f\n", ans);
        });
    }
}
