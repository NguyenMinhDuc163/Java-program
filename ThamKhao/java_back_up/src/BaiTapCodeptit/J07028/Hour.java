package BaiTapCodeptit.J07028;

public class Hour {
    private Teacher teacher;
    private Subject subject;
    private double teachHour;
    public Hour(Teacher teacher, Subject subject, String teachHour) {
        this.teacher = teacher;
        this.subject = subject;
        this.teachHour += Double.parseDouble(teachHour);
    }
    public void setHour(String hour){
        teachHour += Double.parseDouble(hour);
    }

    @Override
    public String toString() {
        return teacher.toString() + String.format(" %.2f", teachHour);
    }
}
