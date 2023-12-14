codeptit/Main.java
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

codeptit/Schedule.java
package codeptit;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Schedule {
      private Subject subject;
      private Teacher teacher;
      private double timeWork;

    public Schedule(Subject subject, Teacher teacher, String timeWork) {
        this.subject = subject;
        this.teacher = teacher;
        this.timeWork = Double.parseDouble(timeWork);
    }
    public String getTeacherID(){
        return teacher.getTeacherID();
    }

    public double getTimeWork() {
        return timeWork;
    }

    @Override
    public String toString() {
        return subject + " " + timeWork;
    }
    
}

codeptit/Subject.java
package codeptit;

/**
 *
 * @author DELL
 */
public class Subject {
    private String subjectID, subjectname;
    private double timeWork;

    public Subject(String subjectID, String subjectname) {
        this.subjectID = subjectID;
        this.subjectname = subjectname;
        this.timeWork = 0;
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return subjectname ;
    }
}

codeptit/Teacher.java
package codeptit;

/**
 *
 * @author DELL
 */
public class Teacher {
    private String teacherID, teacherName;

    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "Giang vien: " + teacherName;
    }
}

