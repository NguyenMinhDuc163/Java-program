package OnTap.J06007;

import java.util.ArrayList;

public class Teacher {
    private String teacherID, teacherName;
    private double time = 0;
    private ArrayList<Subject> subjects;
    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        time = 0;
        subjects = new ArrayList<>();
    }

    public void setTime(String time) {
        this.time += Double.parseDouble(time);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects.add(subjects);
    }

    public String getTime() {
        return String.format("%.2f", time);
    }

    @Override
    public String toString() {
        return "Giang vien: " + teacherName;
    }
}
