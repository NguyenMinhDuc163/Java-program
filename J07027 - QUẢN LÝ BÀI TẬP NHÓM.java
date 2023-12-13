J07027/Assignment.java
package codeptit.J07027;

public class Assignment {
    String assigmentID, assignmentName;

    public Assignment(int assigmentID, String assignmentName) {
        this.assigmentID = String.valueOf(assigmentID);
        this.assignmentName = assignmentName;
    }

    public String getAssigmentID() {
        return assigmentID;
    }

    @Override
    public String toString() {
        return assigmentID + " " + assignmentName;
    }
}

J07027/Group.java
package codeptit.J07027;

public class Group {
    private Student student ;
    private Assignment assignment ;

    public Group(Student student, Assignment assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    public String getStudentID() {
        return student.getStudentID();
    }

    @Override
    public String toString() {
        return student.toString() + " " + assignment.toString();
    }
}

J07027/Main.java
package codeptit.J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            students.add(new Student(sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("BAITAP.in"));
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; i++){
            assignments.add(new Assignment(i, sc.nextLine()));
        }
        sc = new Scanner(new File("NHOM.in"));
        for(int i = 1; i <= n; i++){
            String studentID = sc.next();
            String assigmentID = sc.next();
            Student student = students.stream().filter(x -> x.getStudentID().equals(studentID)).findFirst().orElse(null);
            Assignment assignment = assignments.stream().filter(x -> x.getAssigmentID().equals(assigmentID)).findFirst().orElse(null);
            groups.add(new Group(student, assignment));
        }
        groups.stream().sorted(Comparator.comparing(Group::getStudentID)).forEach(System.out::println);
    }
}

J07027/Student.java
package codeptit.J07027;

public class Student {
    private String studentID, studentName, phoneNum;

    public Student(String studentID, String studentName, String phoneNum) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNum = phoneNum;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, phoneNum);
    }
}

