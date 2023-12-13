J07035/GradeSheet.java
package codeptit.J07035;

public class GradeSheet {
    private Student student;
    private Subject subject;
    private String gpa;

    public GradeSheet(Student student, Subject subject, String gpa) {
        this.student = student;
        this.subject = subject;
        this.gpa = gpa;
    }

    public double getGpa() {
        return Double.parseDouble(gpa);
    }
    public String getStudentID(){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return student.toString() + " " + gpa;
    }
}

J07035/Main.java
package codeptit.J07035;

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

J07035/Student.java
package codeptit.J07035;

public class Student {
    private String studentID, studentName, classRoom, email;

    public Student(String studentID, String studentName, String classRoom, String email) {
        this.studentID = studentID;
        this.studentName = stdName(studentName);
        this.classRoom = classRoom;
        this.email = email;
    }
    public String stdName(String name){
        String []s = name.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, classRoom);
    }
}

J07035/Subject.java
package codeptit.J07035;

public class Subject {
    private String subjectID, subjectName, credit;

    public Subject(String subjectID, String subjectName, String credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

