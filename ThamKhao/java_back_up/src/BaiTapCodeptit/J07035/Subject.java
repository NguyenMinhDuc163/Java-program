package BaiTapCodeptit.J07035;

public class Subject {
    private String subjectID, subjectName, credit;

    public Subject(String subjectID, String subjectName, String credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
