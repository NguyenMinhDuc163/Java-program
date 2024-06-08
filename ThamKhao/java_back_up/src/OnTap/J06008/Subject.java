package OnTap.J06008;

public class Subject {
    private String subjectID, subjectName;

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
