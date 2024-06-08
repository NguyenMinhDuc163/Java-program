package OnTap.J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> subjects = new HashMap<>();
        LinkedHashMap<String, ArrayList<Schedule>> schedules = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            String idx = sc.nextLine();
            subjects.put(idx, new Subject(idx, sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String idx = sc.nextLine();
            Subject subject = subjects.get(idx);
            String thu = sc.nextLine();
            String kip = sc.nextLine();
            String name = sc.nextLine();
            String room = sc.nextLine();
            schedules.put(name, schedules.getOrDefault(name, new ArrayList<>()));
            schedules.get(name).add(new Schedule(i, subject, thu, kip, name, room));
        }
        String name = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + name + ":");
        schedules.get(name).stream().sorted(Comparator.comparing(Schedule::getThu).thenComparing(Schedule::getKip)
                        .thenComparing(Schedule::getName)).forEach(System.out::println);
    }
}
