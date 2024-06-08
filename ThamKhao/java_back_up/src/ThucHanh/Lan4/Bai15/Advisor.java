package ThucHanh.Lan4.Bai15;

public class Advisor {
    private String adviorName, studentID, idea;

    public Advisor(String adviorName, String studentID, String idea) {
        this.adviorName = adviorName;
        this.studentID = studentID;
        this.idea = idea;
    }

    @Override
    public String toString() {
        return adviorName + " " + idea;
    }
}
