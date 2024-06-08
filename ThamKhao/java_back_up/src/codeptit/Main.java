package codeptit;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, Teacher> teachers = new HashMap<>();
        List<Schedule> schedules = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
           String []s = sc.nextLine().split(" ", 2);
           Subject subject = new Subject(s[0], s[1]);
           subjects.put(s[0], subject);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().split(" ", 2);
            Teacher teacher = new Teacher(s[0], s[1]);
            teachers.put(s[0], teacher);
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split(" ");
            Teacher teacher = teachers.get(s[0]);
            Subject subject = subjects.get(s[1]);
            schedules.add(new Schedule(subject, teacher, s[2]));
        }
        String teacher = sc.nextLine();
        System.out.println(teachers.get(teacher));
        double timeWork = 0;
        for(Schedule x : schedules){
            if(x.getTeacherID().equals(teacher)){
                System.out.println(x);
                timeWork += x.getTimeWork();
            }
        }
        System.out.printf("Tong: %.2f", timeWork );
    }
    
}
