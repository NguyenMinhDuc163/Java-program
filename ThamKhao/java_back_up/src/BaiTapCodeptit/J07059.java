package BaiTapCodeptit;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Exam{
    private String idx, day, hour, room;

    public Exam(int idx, String day, String hour, String room) {
        this.idx = String.format("C%03d", idx);
        this.day = day;
        this.hour = hour;
        this.room = room;
    }

    public Exam(String day, String hour) {
        this.day = day;
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public String getIdx() {
        return idx;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s", idx, day, hour, room);
    }
    
}
public class J07059 {
    public static int cmpDay(String a, String b){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = format.parse(a);
            Date date2 = format.parse(b);
            return date1.compareTo(date2);
        } catch (Exception e) {
            System.out.println(e);
        }   
        return 0;
    }
     public static int cmpHour(String a, String b){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try {
            Date date1 = format.parse(a);
            Date date2 = format.parse(b);
            return date1.compareTo(date2);
        } catch (Exception e) {
            System.out.println(e);
        }   
        return 0;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc =  new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Exam> exams = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            exams.add(new Exam(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        exams.stream().sorted(
        Comparator.comparing(Exam::getDay, J07059::cmpDay)
                  .thenComparing(Exam::getHour, J07059::cmpHour)
                  .thenComparing(Exam::getIdx)
        ).forEach(System.out::println);

    }
}
