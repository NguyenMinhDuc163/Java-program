package codeptit;

/**
 *
 * @author DELL
 */
public class Subject {
    private String subjectID, subjectname;
    private double timeWork;

    public Subject(String subjectID, String subjectname) {
        this.subjectID = subjectID;
        this.subjectname = subjectname;
        this.timeWork = 0;
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return subjectname ;
    }
}
