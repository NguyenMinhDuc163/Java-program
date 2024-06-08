package OnTap.J06007;

public class Subject {
    private String subjectID, subjectName;
    private double time ;

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.time = 0;
    }

    public double getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = Double.parseDouble(time);
    }

    @Override
    public String toString() {
        return subjectName + " " + time;
    }
}
