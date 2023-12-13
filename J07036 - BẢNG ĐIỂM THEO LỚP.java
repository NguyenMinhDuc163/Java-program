J07036/Grend.java
package codeptit.J07036;

public class Grend {
    private Student student;
    private Subject subject;
    private String score;

    public Grend(Student student, Subject subject, String score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }
    public String getClassRoom(){
        return student.getClassRoom();
    }

    public String getSubjectID(){
        return subject.getSubjectID();
    }

    public String getStudentID(){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return student + " " + subject + " " + score;
    }
}

J07036/Main.java
package codeptit.J07036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, ArrayList<Grend>> grends = new HashMap<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String studentID = sc.nextLine();
            String studentName = sc.nextLine();
            String classRoom = sc.nextLine();
            String email = sc.nextLine();
            students.put(studentID, new Student(studentID, studentName, classRoom, email));
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
            String []s = sc.nextLine().split("\\s+");
            Student student = students.get(s[0]);
            Subject subject = subjects.get(s[1]);
            grends.put(student.getClassRoom(), grends.getOrDefault(student.getClassRoom(), new ArrayList<>()));
            grends.get(student.getClassRoom()).add(new Grend(student, subject, s[2]));
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String classRoom = sc.nextLine();
            System.out.println("BANG DIEM lop " + classRoom + ":");
//            for(Grend x: grends.get(classRoom))
//                System.out.println(x);
            grends.get(classRoom).stream().sorted(Comparator.comparing(Grend::getSubjectID)
                    .thenComparing(Grend::getStudentID)).forEach(System.out::println);
        }
    }
}

J07036/Student.java
package codeptit.J07036;

public class Student {
    private String studentID, studentName, classRoom, email;

    public String getClassRoom() {
        return classRoom;
    }

    public String stdName(String  name){
        String []s = name.trim().split("\\s+");
        String res  =  "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public Student(String studentID, String studentName, String classRoom, String email) {
        this.studentID = studentID;
        this.studentName = stdName(studentName);
        this.classRoom = classRoom;
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName;
    }
}

J07036/Subject.java
package codeptit.J07036;

public class Subject {
    private String subjectID, subjectName;
    private int credit;

    public Subject(String subjectID, String subjectName, String credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = Integer.parseInt(credit);
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return subjectID + " " + subjectName;
    }
}

