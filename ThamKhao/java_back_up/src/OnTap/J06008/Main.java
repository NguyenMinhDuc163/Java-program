package OnTap.J06008;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, Teacher> teachers = new HashMap<>();
        ArrayList<Schedule> schedules = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String []s = sc.nextLine().split("\\s+", 2);
            subjects.put(s[0], new Subject(s[0], s[1]));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().split("\\s+", 2);
            teachers.put(s[0], new Teacher(s[0], s[1]));
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split("\\s+");
            Teacher teacher = teachers.get(s[0]);
            Subject subject = subjects.get(s[1]);
            schedules.add(new Schedule(teacher, subject, s[2]));
        }
        String gv = sc.nextLine();
        System.out.println(teachers.get(gv));
        Double time = 0.0;
        for(Schedule x: schedules){
            if(x.getTeacher().equals(gv)){
                System.out.println(x);
                time += x.getTime();
            }
        }
        System.out.printf("Tong: %.2f\n", time);
    }
}
