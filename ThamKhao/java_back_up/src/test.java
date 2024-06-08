////package codeptit;
//import java.io.*;
//import java.util.*;
// class Teacher {
//    private String teacherID, teacherName;
//
//    public Teacher(String teacherID, String teacherName) {
//        this.teacherID = teacherID;
//        this.teacherName = teacherName;
//    }
//
//    public String getTeacherID() {
//        return teacherID;
//    }
//
//
//    public String in() {
//        return "Giang vien: " + teacherName;
//    }
//
//}
//
// class Subject {
//    private String subjectID, subjectname;
//    private double timeWork;
//
//    public Subject(String subjectID, String subjectname) {
//        this.subjectID = subjectID;
//        this.subjectname = subjectname;
//        this.timeWork = 0;
//    }
//
//    public String getSubjectID() {
//        return subjectID;
//    }
//
//    public void setTimeWork(double timeWork) {
//        this.timeWork = timeWork;
//    }
//
//
//    public String in() {
//        return subjectname + " " + timeWork;
//    }
//}
//
// class Schedule {
//    private ArrayList<Subject> subjects = new ArrayList<>();
//    private Teacher teacher;
//    private double timeWork;
//
//    public Schedule(Subject subject, Teacher teacher, String timeWork) {
//        this.subjects.add(subject);
//        this.teacher = teacher;
//        this.timeWork = Double.parseDouble(timeWork);
//    }
//
//    public void setSubject(Subject subject, String time){
//        subject.setTimeWork(Double.parseDouble(time));
//        subjects.add(subject);
//    }
//
//    public ArrayList<Subject> getSubjects() {
//        return subjects;
//    }
//
//    public void setTimeWork(String timeWork) {
//        this.timeWork += Double.parseDouble(timeWork);
//    }
//
//    public String getTeacherID(){
//        return teacher.getTeacherID();
//    }
//    @Override
//    public String toString() {
//        String ans = "";
//        for(Subject x: subjects){
//            ans += x.in() + "\n";
//        }
//
//        return teacher.in() + "\n" + ans.trim() + "\nTong: " + String.format("%.2f", timeWork);
//    }
//
//}
//public class test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.useLocale(Locale.US);
//        HashMap<String, codeptit.Subject> subjects = new HashMap<>();
//        HashMap<String, codeptit.Teacher> teachers = new HashMap<>();
//        LinkedHashMap<String, codeptit.Schedule> schedules = new LinkedHashMap<>();
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 1; i <= n; i++){
//            String []s = sc.nextLine().trim().split("\\s+", 2);
//            codeptit.Subject subject = new codeptit.Subject(s[0], s[1]);
//            subjects.put(s[0], subject);
//        }
//        int m = Integer.parseInt(sc.nextLine());
//        for(int i = 1; i <= m; i++){
//            String []s = sc.nextLine().trim().split("\\s+", 2);
//            codeptit.Teacher teacher = new codeptit.Teacher(s[0], s[1]);
//            teachers.put(s[0], teacher);
//        }
//        int k = Integer.parseInt(sc.nextLine());
//        for(int i = 1; i <= k; i++){
//            String []s = sc.nextLine().trim().split("\\s+");
//            codeptit.Teacher teacher = teachers.get(s[0]);
//            codeptit.Subject subject = subjects.get(s[1]);
//            if(schedules.containsKey(s[0])){
//                codeptit.Schedule schedule =  schedules.get(s[0]);
//                schedule.setTimeWork(s[2]);
//                subject.setTimeWork(Double.parseDouble(s[2]));
//                schedule.setSubject(subject, s[2]);
//            }else{
//                codeptit.Schedule schedule = new codeptit.Schedule(subject, teacher,s[2]);
//                subject.setTimeWork(Double.parseDouble(s[2]));
//                schedules.put(s[0], schedule);
//            }
//        }
//        String teacher = sc.nextLine();
//        System.out.println(schedules.get(teacher));
//    }
//
//}