package BaiTapCodeptit.J07075;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        ArrayList<Schedule> schedules = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i = 1; i <= n; i++){
            Subject subject = new Subject(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            subjects.add(subject);
        }
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i = 1; i <= m; i++){
            schedules.add(new Schedule(i, sc2.nextLine(), sc2.nextLine(), sc2.nextLine(),sc2.nextLine(), sc2.nextLine()));
        }
        String s = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        schedules.sort(Comparator.comparing(Schedule::getScheduleDay).thenComparing(Schedule::getSession)
                        .thenComparing(Schedule::getTeacherName));
        for(Schedule x: schedules){
            if(x.getTeacherName().equals(s)){
                System.out.print(x.getGroupID() + " ");
                subjects.stream().filter(a -> a.getSubjectID().equals(x.getScheduleID())).forEach(System.out::print);
                System.out.println(" " + x);
            }
        }
    }
}
