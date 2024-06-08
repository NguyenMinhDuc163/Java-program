package BaiTapCodeptit.J07060;

public class Subject {
    private String subjectID, subjectName, contestType;

    public Subject(String subjectID, String subjectName, String contestType) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.contestType = contestType;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
