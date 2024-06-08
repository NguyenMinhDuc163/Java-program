package BaiTapCodeptit.J07036;

public class Subject {
    private String subjectID, subjectName;
    private int credit;

    public Subject(String subjectID, String subjectName, String credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = Integer.parseInt(credit);
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return subjectID + " " + subjectName;
    }
}
