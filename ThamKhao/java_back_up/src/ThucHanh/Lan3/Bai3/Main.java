package ThucHanh.Lan3.Bai3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, Subject> subjects = new HashMap<>();
        ArrayList<ClassRoom> classRooms = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String subjectID = sc.nextLine();
            String subjectName = sc.nextLine();
            String credit = sc.nextLine();
            subjects.put(subjectID, new Subject(subjectID, subjectName, credit));
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String subjectID = sc.nextLine();
            String thu = sc.nextLine();
            String kip = sc.nextLine();
            String name = sc.nextLine();
            String classRoom = sc.nextLine();
            Subject subject = subjects.get(subjectID);
            classRooms.add(new ClassRoom(i, subject, thu, kip, name, classRoom));
        }
        String teacher = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + teacher + ":");
        classRooms.sort(Comparator.comparing(ClassRoom::getDay)
                        .thenComparing(ClassRoom::getKip)
                .thenComparing(ClassRoom::getName));
        for(ClassRoom x : classRooms){
            if(x.getName().equals(teacher))
                System.out.println(x);
        }
    }
}
