package BaiTapCodeptit.J07027;

public class Assignment {
    String assigmentID, assignmentName;

    public Assignment(int assigmentID, String assignmentName) {
        this.assigmentID = String.valueOf(assigmentID);
        this.assignmentName = assignmentName;
    }

    public String getAssigmentID() {
        return assigmentID;
    }

    @Override
    public String toString() {
        return assigmentID + " " + assignmentName;
    }
}
