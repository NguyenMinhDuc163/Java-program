package OnTap.J06008;

public class Schedule {
    private Teacher teacher;
    private Subject subject;
    private double time;

    public Schedule(Teacher teacher, Subject subject, String time) {
        this.teacher = teacher;
        this.subject = subject;
        this.time = Double.parseDouble(time);
    }

    public String getTeacher() {
        return teacher.getTeacherID();
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return subject + " " + time;
    }
}
