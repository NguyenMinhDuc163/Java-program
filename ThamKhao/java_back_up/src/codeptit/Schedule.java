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
