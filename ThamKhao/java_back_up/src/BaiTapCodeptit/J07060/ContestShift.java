package BaiTapCodeptit.J07060;

public class ContestShift {
    private String ContestShiftID,  date, hour, idContest;

    public ContestShift(String ContestShiftID, String date, String hour, String idContest) {
        this.ContestShiftID = ContestShiftID;
        this.date = date;
        this.hour = hour;
        this.idContest = idContest;
    }

    public String getIdContest() {
        return idContest;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return String.join(" ",date, hour, idContest);
    }
}
