package BaiTapCodeptit.J07035;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, ArrayList<GradeSheet>> gradeSheets = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String studentID = sc.nextLine();
            String studentName = sc.nextLine();
            String classRoom = sc.nextLine();
            String email = sc.nextLine();
            students.put(studentID, new Student(studentID, studentName,classRoom, email));
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String subjectID = sc.nextLine();
            String subjectName = sc.nextLine();
            String credit = sc.nextLine();
            subjects.put(subjectID, new Subject(subjectID, subjectName, credit));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String tmp = sc.nextLine();
            String []s = tmp.trim().split("\\s+");
            gradeSheets.put(s[1], gradeSheets.getOrDefault(s[1], new ArrayList<>()));
            gradeSheets.get(s[1]).add(new GradeSheet(students.get(s[0]), subjects.get(s[1]), s[2]));
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String classID = sc.nextLine();
            System.out.println("BANG DIEM MON " + subjects.get(classID).getSubjectName() + ":");
            ArrayList<GradeSheet> gradeSheetsAns = gradeSheets.get(classID);
            gradeSheetsAns.stream().sorted(Comparator.comparing(GradeSheet::getGpa).reversed().thenComparing(GradeSheet::getStudentID))
                    .forEach(System.out::println);
        }
    }
}
