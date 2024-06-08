package BaiTapCodeptit.J07075;

public class Schedule {
    private String groupID, scheduleID, scheduleDay, session, teacherName, classRoom;

    public Schedule(int idx, String scheduleID, String scheduleDay, String session, String teacherName, String classRoom) {
        this.groupID = String.format("HP%03d",idx);
        this.scheduleID = scheduleID;
        this.scheduleDay = scheduleDay;
        this.session = session;
        this.teacherName = teacherName;
        this.classRoom = classRoom;
    }

    public String getScheduleDay() {
        return scheduleDay;
    }

    public String getSession() {
        return session;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public String getGroupID() {
        return groupID;
    }

    @Override
    public String toString() {
        return String.join(" ", scheduleDay, session, classRoom);
    }
}
