package OnTap.J07074;

public class Schedule {
    private String scheduleID;
    private Subject subject;
    private String thu, kip, name, room;

    public Schedule(int scheduleID, Subject subject, String thu, String kip, String name, String room) {
        this.scheduleID = String.format("HP%03d", scheduleID);
        this.subject = subject;
        this.thu = thu;
        this.kip = kip;
        this.name = name;
        this.room = room;
    }

    public String getThu() {
        return thu;
    }

    public String getName() {
        return name;
    }

    public String getKip() {
        return kip;
    }

    @Override
    public String toString() {
        return String.join(" ", scheduleID, subject.toString(), thu, kip, room);
    }
}
