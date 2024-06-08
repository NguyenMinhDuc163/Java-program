package BaiTapCodeptit.J07060;

public class ContestSchedule {
    private ContestShift contestShift;
    private Subject subject;
    private String groupID, studentID;

    public ContestSchedule(ContestShift contestShift, Subject subject, String groupID, String studentID) {
        this.contestShift = contestShift;
        this.subject = subject;
        this.groupID = groupID;
        this.studentID = studentID;
    }

    public String getGroupID() {
        return groupID;
    }

    public String getDate(){
        return contestShift.getDate();
    }
    public String  getHour(){
        return contestShift.getHour();
    }
    public String getIdContest(){
        return contestShift.getIdContest();
    }
    @Override
    public String toString() {
        return contestShift + " " + subject + " " + groupID + " " + studentID;
    }
}
