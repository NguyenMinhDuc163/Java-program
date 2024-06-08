package ThucHanh.Lan3.Bai3;

public class ClassRoom {
    private String groupID;
    private Subject subject;
    private String name, classRoom;
    private int day, kip;

    public ClassRoom(int idx, Subject subject, String day, String kip, String name, String classRoom) {
        this.groupID = String.format("HP%03d", idx);
        this.subject = subject;
        this.day = Integer.parseInt(day);
        this.kip = Integer.parseInt(kip);
        this.name = name;
        this.classRoom = classRoom;
    }

    public int getKip() {
        return kip;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return groupID + " " + subject + " " + day + " " + kip + " " + classRoom;
    }
}
