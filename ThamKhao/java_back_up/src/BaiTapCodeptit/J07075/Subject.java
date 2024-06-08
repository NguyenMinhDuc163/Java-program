package BaiTapCodeptit.J07075;

public class Subject {
    private String subjectID, subjectName,creditNum;

    public Subject(String subjectID, String subjectName, String creditNum) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.creditNum = creditNum;
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
