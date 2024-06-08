package BaiTapCodeptit.J07060;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, ContestShift> contestShifts = new HashMap<>();
        List<ContestSchedule> contestSchedules = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String subjectID = sc.nextLine();
            String subjectName = sc.nextLine();
            String subjectType = sc.nextLine();
            subjects.put(subjectID, new Subject(subjectID, subjectName, subjectType));
        }
        sc = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String idx = String.format("C%03d", i);
            String date = sc.nextLine();
            String hour = sc.nextLine();
            String roomID = sc.nextLine();
            contestShifts.put(idx, new ContestShift(idx, date,hour, roomID));
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String  []s = sc.nextLine().trim().split("\\s+");
            ContestShift contestShift = contestShifts.get(s[0]);
            Subject subject = subjects.get(s[1]);
            contestSchedules.add(new ContestSchedule(contestShift, subject, s[2], s[3]));
        }
        contestSchedules.stream().sorted(Comparator.comparing(ContestSchedule::getDate, Main::cmpDay)
                .thenComparing(ContestSchedule::getHour, Main::cmpHour)
                .thenComparing(ContestSchedule::getIdContest))
                .forEach(System.out::println);
    }
}
